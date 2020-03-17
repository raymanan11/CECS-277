package ClassesProject;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Snack> products;

    private ArrayList<Snack> shoppingCart;

    public VendingMachine() {
        products = new ArrayList<>();
        shoppingCart = new ArrayList<>();
    }

    /**
     * used whenever showing snacks
     * @return all snacks available
     */
    public String showProducts() {
        String allProducts = "";

        for(Snack item : products) {
            allProducts = allProducts + item + " (" +
                    item.getQuantity() + "X)" + "\n";
        }

        return allProducts;
    }

    /**
     * used whenever buying so user can choose what number snack to choose
     * @return selection of snacks with numbered choices
     */
    public String showNumberProducts() {
        String allProducts = "";

        int counter = 1;
        for(Snack item : products) {
            allProducts = allProducts + counter + ") " + item + " (" +
                    item.getQuantity() + "X)" + "\n";
            counter++;
        }

        return allProducts;
    }

    /**
     *
     * @param location from choosing which snack to buy
     * @return the snack from that selection
     */
    public Snack getSnack(int location) {
        return products.get(location - 1);
    }

    public void addSnack(Snack snack) {
        products.add(snack);
    }

    public void addShoppingCart(Snack snack) {
        shoppingCart.add(snack);
    }

    public ArrayList<Snack> getShoppingCart() {
        return shoppingCart;
    }

    public ArrayList<Snack> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Vending Machine";
    }
}
