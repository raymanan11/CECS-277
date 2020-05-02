package Observer_Project;

import java.util.ArrayList;

public class Stock implements Subject {

    private ArrayList<Observer> observers;
    private String stockName;
    private double stockValue;

    public Stock() {
        observers = new ArrayList<>();
        stockName = "RAY";
        stockValue = 152.00;
    }

    public Stock(String stockName, double stockValue) {
        observers = new ArrayList<>();
        this.stockName = stockName;
        this.stockValue = stockValue;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Trader trader, String transactionType) {
        System.out.println("Latest trade is Trader: " + trader + " " + transactionType + " " + stockName + " @ $" + stockValue);
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(stockName, transactionType);
        }
    }

    @Override
    public String toString() {
        return stockName + " @ " + stockValue;
    }
}
