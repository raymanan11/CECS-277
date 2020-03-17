package ClassesProject;
import java.util.Scanner;

public class VendingInput {
    private User user;
    VendingMachine vendingMachine;
    Money money;

    public VendingInput() {
        vendingMachine = new VendingMachine();
        money = new Money();
    }

    public void currentUser(User person) {
        user = person;
    }

    public void vending() {
        Scanner scnr = new Scanner(System.in);
        char userInput;

        do {
            if(user instanceof Operator) {
                System.out.println("**** OPERATOR ****");
            }
            else {
                System.out.println("**** USER ****");
            }

            System.out.println("S)how products  I)nsert Coin  B)uy  A)dd Product  R)emove coins  Q)uit");
            System.out.print("Enter choice: ");
            userInput = getUserInput(scnr);

            switch(userInput) {
                case 'S':
                    if(vendingMachine.getProducts().isEmpty()) {
                        System.out.println("Sorry no products available!");
                    }
                    else {
                        System.out.println(vendingMachine.showProducts());
                    }
                    break;
                case 'I':
                    if(user instanceof Customer) {
                        insertMoney(scnr, money);
                    }
                    else {
                        System.out.println("Operator cannot insert money!");
                    }
                    break;
                case 'B':
                    if(user instanceof Customer) {
                        System.out.println(vendingMachine.showNumberProducts());
                        System.out.println();
                        System.out.print("Please enter choice: ");
                        int snackChoice = scnr.nextInt();

                        Snack snack = vendingMachine.getSnack(snackChoice);

                        buySnack(snack);
                    }
                    else {
                        System.out.println("Operator can't buy anything!");
                    }
                    break;
                case 'A':
                    if(user instanceof Operator) {
                        System.out.print("Enter Product Name: ");
                        String snackInput = scnr.next();
                        System.out.print("Enter Price: ");
                        double snackPrice = scnr.nextDouble();
                        System.out.print("Enter quantity: ");
                        int numSnacks = scnr.nextInt();

                        Snack snack2 = new Snack(snackInput, snackPrice, numSnacks);
                        vendingMachine.addSnack(snack2);
                    }
                    else {
                        System.out.println("User can't buy anything!");
                    }
                    break;
                case 'R':
                    if(user instanceof Operator) {
                        System.out.println(user + " made: $" + money.removeMoney());
                        //money.forgetMoney();
                        money.noMoney();
                    }
                    else {
                        System.out.println("User can't rob this machine!");
                    }
                    break;
                case 'Q':
                    break;
            }
            System.out.println();
        }
        while(userInput != 'Q');
    }

    private void buySnack(Snack snack) {
        if(snack.getQuantity() < 1) {
            System.out.println("No more of this product. $" + money.getTotalAmount()
                    + " returned.");
            System.out.println();
        }

        else if(snack.getPrice() <= money.getTotalAmount()) {
            System.out.println("Purchased: " + snack);
            snack.decreaseQuantity();
            vendingMachine.addShoppingCart(snack);
            // remembers money that you put in because you bought a snack
            money.rememberMoney();
            // sets money entered to 0 so you can't buy snacks using same money
            money.noMoney();
            System.out.println();
        }

        else {
            System.out.println("Not enough money.");
            // if shoppingcart is empty then that means user hasn't bought anything which means
            // return the money back to user and coins won't go into vending machine
            System.out.println("Returned: $"+ money.getTotalAmount());
            money.noMoney();
//            if(vendingMachine.getShoppingCart().isEmpty()) {
//                //System.out.println("Returned: $"+ money.getTotalAmount());
//                money.noMoney();
//                //money.forgetMoney();
//            }
        }
    }

    private void insertMoney(Scanner scnr, Money money) {
        System.out.println("A) nickel - $0.05");
        System.out.println("B) dime - $0.10");
        System.out.println("C) quarter - $0.25");
        System.out.println("D) dollar - $1.00");

        char moneyChoice = scnr.next().charAt(0);
        moneyChoice = Character.toUpperCase(moneyChoice);

        switch(moneyChoice) {
            case 'A':
                money.addMoney(0.05);
                break;
            case 'B':
                money.addMoney(0.10);
                break;
            case 'C':
                money.addMoney(0.25);
                break;
            case 'D':
                money.addMoney(1.00);
        }

        System.out.println();
        System.out.println(money);
    }

    private char getUserInput(Scanner scnr) {
        char userInput;
        userInput = scnr.next().charAt(0);
        userInput = Character.toUpperCase(userInput);
        return userInput;
    }
}
