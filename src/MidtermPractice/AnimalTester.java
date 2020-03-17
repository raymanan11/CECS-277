package MidtermPractice;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.talking() + "\n" + dog.type());
        System.out.println(cat.talking() + "\n" + cat.type());
    }
}
