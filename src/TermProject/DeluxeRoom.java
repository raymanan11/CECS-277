package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Subclass of Motel Room that represents the Deluxe Room
 */
public class DeluxeRoom extends MotelRoom {
    private double cost = 75.00;

    /**
     * Default constructor that initializes description of Deluxe Room
     */
    public DeluxeRoom() {
        description = "Deluxe";
    }

    /**
     *
     * @return cost of room
     */
    @Override
    public double cost() {
        return cost;
    }

    /**
     *
     * @return the description of the room as well as the cost
     */
    public String toString() {
        return getDescription() + " " + cost;
    }
}
