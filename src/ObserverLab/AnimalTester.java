package ObserverLab;

public class AnimalTester {
    public static void main (String[] args) {
        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
        zoo.addAnimal(new Animal("Tiger"));
        PrintNameAnimalAddedListener al1 = new PrintNameAnimalAddedListener();
        PrintNameAnimalAddedListener al2 = new PrintNameAnimalAddedListener();
        zoo.registerAnimalAddedListener(al1);
        zoo.registerAnimalAddedListener(al2);
        zoo.addAnimal(new Animal("Lion"));
        zoo.unregisterAnimalAddedListener(al1);
        zoo.addAnimal(new Animal("Bear"));
    }

}
