package IPIProject;

import java.util.ArrayList;

public class Checkout {
    ArrayList<DessertItem> allDesserts;
    private double taxRate = 0;
    private int cost = 0;
    private final int HUNDRED = 100;

    public Checkout() {
        allDesserts = new ArrayList<>();
    }

    public void clear() {
        allDesserts.removeAll(allDesserts);
    }

    public void enterItem(DessertItem item) {
        allDesserts.add(item);
    }

    public int numberOfItems() {
        return allDesserts.size();
    }

    public int totalCost() {
        for (DessertItem dessert : allDesserts) {
            cost = cost + (int)(Math.round(dessert.getCost() * HUNDRED));
        }
        return cost;
    }

    public int totalTax() {
        return (int) Math.round(cost * (taxRate / HUNDRED));
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String toString() {
        // 43
        String receipt = "";
        receipt = receipt + "            R & R Dessert Shop\n";
        receipt = receipt + "         ------------------------\n";
        for(DessertItem item : allDesserts) {
            receipt = receipt + item + "           " + item.getCost() + "\n";
            String h = item + "           " + item.getCost() + "\n";

        }
        return receipt;
    }

}
