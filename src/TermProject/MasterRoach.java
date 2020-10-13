package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Payment using MasterRoach that credit card info
 */
public class MasterRoach implements Payment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    /**
     * Default constructor initializing variables
     */
    public MasterRoach() {
        name = "Roach Durant";
        cardNumber = "6797853746457842";
        cvv = "953";
        dateOfExpiry = "5/22";
    }

    /**
     * parametrized constructor that allows input for credit card info
     * @param name
     * @param cardNumber
     * @param cvv
     * @param dateOfExpiry
     */
    public MasterRoach(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    /**
     * Prints amount paid with credit / debit card
     * @param n amount to pay
     */
    @Override
    public void pay(double n) {
        System.out.println(n + " paid with Credit / Debit Card");
    }

    /**
     *
     * @return what type of payment
     */
    @Override
    public String toString() {
        return "MasterRoach";
    }
}
