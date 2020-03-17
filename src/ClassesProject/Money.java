package ClassesProject;

public class Money {
    private double moneyEntered;
    private double totalCoins = 0;

    public Money() {
        moneyEntered = 0;
    }

    public void addMoney(double amount) {
        moneyEntered = moneyEntered + amount;
    }

    public double getTotalAmount() {
        return moneyEntered;
    }


    /**
     * no change is dealt back and can't buy anymore
     * snacks with leftover money
     */
    public void noMoney() {
        moneyEntered = 0;

    }

    /**
     * whenever is able to buy a snack, remember the amount entered in order to
     * remove coins in the machine
     */
    public void rememberMoney() {
        totalCoins = totalCoins + moneyEntered;
    }

    /**
     *
     * @return totalCoins put into the vending machine
     */
    public double removeMoney() {
        return totalCoins;
    }

    @Override
    public String toString() {
        return "Money entered: $" + moneyEntered;
    }
}
