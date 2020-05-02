package VisitorLab;

public class Visitor implements ShoppingCartVisitor {

    public double visit(Magazine mag) {
        //System.out.println("Magazine item: Price with Tax");
        System.out.println("Magazine title is: " + mag.getTitle());
        System.out.println("Issue Date: " + mag.getVdate());

        if(mag.getPrice() > 5.00) {
            return mag.getPrice() + (mag.getPrice() * .10);
        }
        else {
            return mag.getPrice();
        }
    }
    public double visit(Fruit fruit) {
        System.out.println("Name of fruit is: " + fruit.getName());
        return fruit.getPrice();
    }
}
