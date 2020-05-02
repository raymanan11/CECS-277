package FactoryLab;
// a concrete instance of ice cream

public class Strawberry extends IceCream {
    public static final double COST = 1.05;

    public Strawberry() {
        description = "Sweet Strawberry ice cream";
    }

    public double cost() {
        return COST;
    }
}
