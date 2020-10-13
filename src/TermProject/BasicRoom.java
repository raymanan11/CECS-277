package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Subclass of Motel Room that represents the base or Basic Room
 */
public class BasicRoom extends MotelRoom {
    private Double cost = 50.00;

    /**
     * Default constructor that initializes description of basic room
     */
    public BasicRoom() {
        description = "Basic";
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
    @Override
    public String toString() {
        return getDescription() + " " + cost;
    }
}
