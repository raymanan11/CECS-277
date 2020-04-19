package ObserverLab;

public class PrintNameAnimalAddedListener implements Observer {

    // every time observer is created, allow the subject to know about it by "subscribing"
    // to it
    public PrintNameAnimalAddedListener() {
        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(this);
    }

    @Override
    public void update(Animal a) {
        System.out.println("The latest animal is a " + a);
    }
}
