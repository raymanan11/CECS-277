package StrategyLab;

public class PaypalStrategy implements PaymentStrategy {

    private String emailID;
    private String password;

    public PaypalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int n) {
        System.out.println("Used Paypal and paid $" + n);
    }
}
