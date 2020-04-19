package ObserverLab;

public interface Subject {

    public void registerAnimalAddedListener(Observer o);

    public void unregisterAnimalAddedListener(Observer o);

    public void notifyObservers();
}
