package IPIProject;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        CandyItem candy1 = new CandyItem("Corn", 1.5, 725);
        candy1.setCalories(500);
        CandyItem candy2 = new CandyItem("Lolipop", 2.5, 825);
        candy2.setCalories(640);

        CookieItem cookie1 = new CookieItem("ChocChip", 17, 499);
        cookie1.setCalories(250);
        CookieItem cookie2 = new CookieItem("Oatmeal", 15, 399);
        cookie2.setCalories(240);

        IceCream iceCream1 = new IceCream("Vanilla", 10.05);
        iceCream1.setCalories(500);
        IceCream iceCream2 = new IceCream("Chocolate", 9.99);
        iceCream2.setCalories(500);

        Sundae sundae1 = new Sundae("Caramel", 5.70);
        sundae1.setTopping("hot fudge");
        sundae1.setCalories(600);
        Sundae sundae2 = new Sundae("Banana Split", 5.40);
        sundae2.setTopping("strawberries");
        sundae2.setCalories(560);


        checkout.enterItem(candy1);
        checkout.enterItem(candy2);

        checkout.enterItem(cookie1);
        checkout.enterItem(cookie2);

        checkout.enterItem(iceCream1);
        checkout.enterItem(iceCream2);

        checkout.enterItem(sundae1);
        checkout.enterItem(sundae2);

        checkout.setTaxRate(7.75);

        System.out.println("Candy Test: ");
        System.out.println();
        System.out.println(candy1);
        System.out.println();
        System.out.println(candy2);
        System.out.println("-------------------------------");

        System.out.println("Cookie Test: ");
        System.out.println();
        System.out.println(cookie1);
        System.out.println();
        System.out.println(cookie2);
        System.out.println("-------------------------------");

        System.out.println("Ice Cream Test: ");
        System.out.println();
        System.out.println(iceCream1);
        System.out.println();
        System.out.println(iceCream2);
        System.out.println("-------------------------------");

        System.out.println("Sundae Test: ");
        System.out.println();
        System.out.println(sundae1);
        System.out.println();
        System.out.println(sundae2);
        System.out.println("-------------------------------");

        System.out.println(checkout);
        System.out.println("----------------------------------------");

        System.out.println("Max Test with Same DessertItem Types: ");
        DessertItem biggerCandy = DessertItem.max(candy1, candy2);
        DessertItem biggerCookie = DessertItem.max(cookie1, cookie2);
        DessertItem biggerIceCream = DessertItem.max(iceCream1, iceCream2);
        DessertItem biggerSundae = DessertItem.max(sundae1, sundae2);


        if(biggerCandy == null) {
            System.out.println(candy1.getName() + "(Candy) with " + candy1.getCalories() + " calories is equal to "
                    + candy2.getName() + "(Candy) with " + candy2.getCalories() + " calories.");
        }

        else if(biggerCandy == candy1) {
            System.out.println(candy1.getName() + "(Candy) with " + candy1.getCalories() + " calories is bigger than "
            + candy2.getName() + "(Candy) with " + candy2.getCalories() + " calories.");
        }
        else {
            System.out.println(candy2.getName() + "(Candy) with " + candy2.getCalories() + " calories is bigger than "
                    + candy1.getName() + "(Candy) with " + candy1.getCalories() + " calories.");
        }



        if(biggerCookie == null) {
            System.out.println(cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories is equal to "
                    + cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories.");
        }

        else if(biggerCookie == cookie1) {
            System.out.println(cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories is bigger than "
                    + cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories.");
        }
        else {
            System.out.println(cookie2.getName() + "(Candy) with " + cookie2.getCalories() + " calories is bigger than "
                    + cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories.");
        }



        if(biggerIceCream == null) {
            System.out.println(iceCream1.getName() + "(Ice Cream) with " + iceCream1.getCalories() + " calories is equal to "
                    + iceCream2.getName() + "(Ice Cream) with " + iceCream2.getCalories() + " calories.");
        }

        else if(biggerIceCream == iceCream1) {
            System.out.println(iceCream1.getName() + "(Ice Cream) with " + iceCream1.getCalories() + " calories is bigger than "
                    + iceCream2.getName() + "(Ice Cream) with " + iceCream2.getCalories() + " calories.");
        }
        else {
            System.out.println(iceCream2.getName() + "(Ice Cream) with " + iceCream2.getCalories() + " calories is bigger than "
                    + iceCream1.getName() + "(Ice Cream) with " + iceCream1.getCalories() + " calories.");
        }



        if(biggerSundae == null) {
            System.out.println(sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " calories is equal to "
                    + sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories.");
        }

        else if(biggerSundae == sundae1) {
            System.out.println(sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " calories is bigger than "
                    + sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories.");
        }
        else {
            System.out.println(sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories is bigger than "
                    + sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " calories.");
        }


        System.out.println("\n" + "Unsorted calories: ");
        for(DessertItem item : checkout.getDesserts()) {
            System.out.println(item.getName() + item.getType() + " has " + item.getCalories() + " calories.");
        }

        System.out.println("\n" + "Sorted calories: ");
        ArrayList<DessertItem> desserts = checkout.getDesserts();
        checkout.sortCalories(desserts);
        for(DessertItem item : checkout.getDesserts()) {
            System.out.println(item.getName() + item.getType() + " has " + item.getCalories() + " calories.");
        }



    }
}
