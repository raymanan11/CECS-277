package IPIProject;

public class Tester {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        IceCream iceCream = new IceCream("Cookies and Cream", 5.57);
        Sundae sundae = new Sundae("Caramel", 7.70);

        sundae.setTopping("sprinkles");

        checkout.enterItem(iceCream);
        checkout.enterItem(sundae);

//        sundae.setTopping("strawberries");

        System.out.println("Total cost is: " + checkout.totalCost());

        checkout.setTaxRate(7.75);

        System.out.println("Total tax is: " + checkout.totalTax());

        System.out.println(checkout);

    }
}
