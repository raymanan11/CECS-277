package LabSingleton;

public class SingletonTester {
    public static void main(String[] args) {
        MathLibrary mathOne = MathLibrary.getInstance();
        MathLibrary mathTwo = MathLibrary.getInstance();

        System.out.println(mathOne.hashCode());
        System.out.println(mathTwo.hashCode());

        System.out.println(mathOne.toString());
        System.out.println(mathTwo.toString());
    }
}
