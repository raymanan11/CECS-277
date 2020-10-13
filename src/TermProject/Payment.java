package TermProject;
/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Interface to implement Strategy Design Pattern
 */
public interface Payment {
    /**
     * method that RoachPal and MasterRoach need to implement
     * @param n amount needed to pay
     */
    public void pay(double n);

}
