package FactoryLab;
// a concrete instance of ice cream

public class Vanilla extends IceCream {
    public static final double COST = 1.25;

    public Vanilla() {
        description = "Creamy vanilla ice cream";
    }

    public double cost() {
        return COST;
    }
}

