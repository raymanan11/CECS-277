package VisitorLab;

public class VisitorTester {
    public static void main(String[] args) {
        Visitor calc = new Visitor();

        Fruit fruit = new Fruit("apple", 3, 0.25);
        Magazine magazine = new Magazine("Vogue", "April 2020", 6.00);

        System.out.println("Cost of fruit is $" + fruit.accept(calc));
        System.out.println("Cost of magazine is $" + magazine.accept(calc));
    }



}
