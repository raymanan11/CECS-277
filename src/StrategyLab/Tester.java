package StrategyLab;

public class Tester {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("24657", 10);
        Item item2 = new Item("87968", 7);
        Item item3 = new Item("56773", 13);
        Item item4 = new Item("65635", 15);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.pay(new PaypalStrategy("raymondan100@gmail.com", "ILikePizza"));

        cart.pay(new CreditCardStrategy("Raymond An", "456876453", "323", "2/24"));

    }
}
