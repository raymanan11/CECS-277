package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Payment using RoachPal that has email and password
 */
public class RoachPal implements Payment{
    private String email;
    private String password;

    /**
     * Default constructor that initializes email and password
     */
    public RoachPal() {
        email = "roachesarelife100@roachmail.com";
        password = "gottaloveroaches3245675";
    }

    /**
     * Parameterized constructor that allows for email and password
     * @param email
     * @param password
     */
    public RoachPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    /**
     * Implemented method from interface Payment that is customized for RoachPal
     * to print out email
     */
    public void pay(double n) {
        System.out.println("Email: " + email + " Payment: " + n + " completed");
    }

    /**
     *
     * @return type of payment
     */
    @Override
    public String toString() {
        return "RoachPal";
    }
}
