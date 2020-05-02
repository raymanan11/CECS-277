package Observer_Project;

import java.util.ArrayList;

public class StockTester {
    public static ArrayList<Stock> stocks;

    public static void main(String[] args) {
        stocks = new ArrayList<>();
        Stock apple = new Stock("APPL", 280.08);
        stocks.add(apple);
        Stock microsoft = new Stock("MSFT", 177.63);
        stocks.add(microsoft);
        Stock google = new Stock("GOOG", 1277.84);
        stocks.add(google);

        Trader t1 = new Trader("Raymond");
        Trader t2 = new Trader("Jack");
        Trader t3 = new Trader("Tracy");
        Trader t4 = new Trader("Bailey");
        Trader t5 = new Trader("Mark");

        // Raymond
        apple.addObserver(t1);
        // Tracy
        apple.addObserver(t3);
        // Bailey
        apple.addObserver(t4);

        // Raymond
        microsoft.addObserver(t1);
        // Jack
        microsoft.addObserver(t2);
        // Mark
        microsoft.addObserver(t5);

        // Jack
        google.addObserver(t2);
        // Tracy
        google.addObserver(t3);
        // Bailey
        google.addObserver(t4);
        // Mark
        google.addObserver(t5);

        buyStock(t3, apple);
        buyStock(t2, microsoft);
        buyStock(t5, google);

        sellStock(t1, apple);
        sellStock(t3, apple);
        sellStock(t4, microsoft);
        sellStock(t2, microsoft);
        sellStock(t1,google);
        sellStock(t5, google);

    }

    public static void sellStock(Trader trader, Stock stock) {
        if(!trader.getStocks().contains(stock)) {
            System.out.println("Sorry not able to sell because you don't have that stock!");
        }
        else {
            trader.removeFromHoldings(stock);
            stock.notifyObservers(trader, "sells");
        }
    }


    public static void buyStock(Trader trader, Stock stock) {
        if(!stocks.contains(stock)) {
            System.out.println("Stock isn't found!");
        }
        else {
            trader.addToHoldings(stock);
            stock.notifyObservers(trader, "buys");
        }
    }
}
