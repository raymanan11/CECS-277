package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Class that is an amenity, AutoRefillBar, that is available to add to rooms using
 * Decorator Design Pattern
 */
public class AutoRefillFoodBar extends RoomDecorator{
    private MotelRoom room;

    public static final double COST = 15.00;

    /**
     * Default constructor that initializes room to null
     */
    public AutoRefillFoodBar() {
        room = null;
    }

    /**
     * Implements Decorator Pattern by allowing MotelRoom to be added to
     * parameterized constructor
     * @param room
     */
    public AutoRefillFoodBar(MotelRoom room) {
        this.room = room;
    }

    /**
     * Adds description of amenity, Refill Bar, on top of room description
     * @return description of room and amenities
     */
    public String getDescription() {
        return room.getDescription() + ", Refill Bar";
    }

    /**
     *
     * @return cost of room + amenity cost
     */
    public double cost() {
        return room.cost() + COST;
    }

    /**
     *
     * @return room description + total cost
     */
    public String toString() {
        return getDescription() + " " + cost();
    }
}
