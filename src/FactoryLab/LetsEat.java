package FactoryLab;

public class LetsEat {
    public static void main(String[] args) {
        IceCreamShop dq = new DairyQueen();
        IceCream cone;

        cone = dq.getIceCream("Chocolate");
        System.out.println("Enjoying some " + cone.getDescription() + " which costs " + cone.cost());

        cone = dq.getIceCream("Strawberry");
        System.out.println("Enjoying some " + cone.getDescription() + " which costs " + cone.cost());

    }
}
