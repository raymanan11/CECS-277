package ObserverLab;

import java.util.ArrayList;

public class Zoo implements Subject {

    private ArrayList<Observer> observers;
    private Animal latestAnimal;

    public Zoo() {
        observers = new ArrayList<>();
    }

    public void registerAnimalAddedListener(Observer o) {
        observers.add(o);
    }

    public void unregisterAnimalAddedListener(Observer o) {
        observers.remove(0);
    }

    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            Observer obs = observers.get(i);
            obs.update(latestAnimal);
        }
    }

    // every time an animal is added, that means that the state has changed so have to
    // notify all of the observers
    public void addAnimal(Animal animal) {
        latestAnimal = animal;

        notifyObservers();
    }
}
