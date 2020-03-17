package MidtermPractice;

public class Cat implements Animal {
    @Override
    public String talking() {
        return "Cat is meowing!";
    }

    @Override
    public String type() {
        return "I'm a cat and I'm lazy!";
    }
}
