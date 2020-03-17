package MidtermPractice;

public class Dog implements Animal {
    @Override
    public String talking() {
        return "Dog is barking!";
    }

    @Override
    public String type() {
        return "I'm a dog and I'm constantly running!";
    }
}
