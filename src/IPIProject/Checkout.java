package IPIProject;

import java.util.ArrayList;

public class Checkout {
    private ArrayList<DessertItem> allDesserts;
    private double taxRate = 0;
    private int cost = 0;
    private final double HUNDRED = 100;

    public Checkout() {
        allDesserts = new ArrayList<>();
    }

    public ArrayList<DessertItem> getDesserts() {
        return allDesserts;
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
        cost = 0;
        for (DessertItem dessert : allDesserts) {
            //System.out.println("Cost of " + dessert.getName() + " is " + (dessert.getCost()));
            cost = cost + (int)(Math.round(dessert.getCost() * HUNDRED));
        }
        return cost;
    }

    public int totalTax() {

        totalCost();
        return (int) Math.round(cost * (taxRate / HUNDRED));
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String bodyReceipt() {
        String receiptBody = "";
        for (DessertItem item : allDesserts) {
            receiptBody = receiptBody + "\n" + item.toString() + "\n";
        }
        return receiptBody;
    }

    public String toString() {
        return "Number of items: " + numberOfItems() + "\n" +
                "Total cost: " + totalCost() + "\n" +
                "Total tax: " + totalTax() + "\n" +
                "Cost + Tax: " + (int)(totalCost() + totalTax()) + "\n" + "\n" +
                "          R & R Dessert Shop          " + "\n" +
                "-------------------------------------" +
                bodyReceipt() + "\n" +
                "Tax: " + totalTax() / HUNDRED+ "\n" +
                "Total cost: " + (totalCost() + totalTax())/ HUNDRED + "\n";
    }

    public ArrayList<DessertItem> sortCalories(ArrayList<DessertItem> arr) {
        for (int sorted = 0; sorted < arr.size() - 1; sorted++) {
            for (int i = 0; i < arr.size() - sorted - 1; i++) {
                if(arr.get(i).getCalories() > arr.get(i+1).getCalories()){
                    DessertItem temp = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, temp);
                }
            }
        }
       return arr;
    }

}
