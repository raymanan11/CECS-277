package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: The Superclass of the Room Types but also used for Decorator Design Pattern
 */
public abstract class MotelRoom {

    protected String description;

    /**
     * Default Constructor to initialize description
     */
    public MotelRoom() {
        description = "Boring";
    }

    /**
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Abstract class that is needed to be implemented by sublass rooms and amenities
     * for Decorator Patter
     * @return cost of room
     */
    public abstract double cost();

    /**
     *
     * @return type of room
     */
    @Override
    public String toString() {
        return "Motel Room";
    }
}
