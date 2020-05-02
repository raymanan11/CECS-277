package DecoratorLab;

public class Vanilla extends Dessert {
    public static final double COST = 1.25;

    public Vanilla() {
        description = "Creamy vanilla";
    }

    public double cost() {
        return COST;
    }
}


