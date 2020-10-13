package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Subclass of Motel Room that represents the Suite Room
 */
public class SuiteRoom extends MotelRoom {
    private Double cost = 100.00;

    /**
     * Default constructor that initializes description of Suite Room
     */
    public SuiteRoom() {
        description = "Suite";
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
