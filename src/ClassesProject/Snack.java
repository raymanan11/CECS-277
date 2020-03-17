package ClassesProject;

public class Snack {
    private String snack;
    private double price;
    private int quantity;

    public Snack(){
        snack = "Doritos";
        price = 1.00;
        quantity = 1;
    }

    public Snack(String snack, double price, int quantity) {
        this.snack = snack;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        quantity = quantity - 1;
    }

    @Override
    public String toString() {
        return snack + " @ $" + price;
    }
}
