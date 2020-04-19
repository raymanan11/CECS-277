package ObserverLab;

public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return animalName;
    }
}
