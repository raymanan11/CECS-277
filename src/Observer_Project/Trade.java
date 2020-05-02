package Observer_Project;

public class Trade {
    private String name;
    private int amount;
    private String stockName;
    private boolean transactionType;

    public Trade(String name, int amount, String stockName) {
        this.name = name;
        this.amount = amount;
        this.stockName = stockName;
    }

    public void setTransactionType(String type) {
        if(type.equals("buy")) {
            transactionType = true;
        }
        else if(type.equals("sell")) {
            transactionType = false;
        }
    }

    @Override
    public String toString() {
        if(transactionType) {
            return name + " buys $" + amount + " Stock: " + stockName;
        }
        else {
            return name + " sells $" + amount + " Stock: " + stockName;
        }
    }
}
