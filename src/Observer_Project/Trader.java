package Observer_Project;

import java.util.ArrayList;

public class Trader implements Observer {
    private String name;
    private ArrayList<Stock> holdings;

    // every time an observer object is created, depending on the stock object, it will
    // add to that stock's list of observer
    public Trader(String name) {
        this.name = name;
        holdings = new ArrayList<>();
    }

    public void addToHoldings(Stock stock) {
        holdings.add(stock);
    }

    public void removeFromHoldings(Stock stock) {
        holdings.remove(stock);
    }

    public void update(String stockName, String transactiontype) {
        System.out.println(name + " able to see " + transactiontype + " for " + stockName);
    }


    public ArrayList<Stock> getStocks() {
        return holdings;
    }

    @Override
    public String toString() {
        return name;
    }
}
