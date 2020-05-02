package Observer_Project;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers(Trader trader, String transactionType);

}

