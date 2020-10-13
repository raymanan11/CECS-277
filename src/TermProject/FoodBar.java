package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Class that is an amenity, FoodBar, that is available to add to rooms using
 * Decorator Design Pattern
 */
public class FoodBar extends RoomDecorator {
    private MotelRoom room;

    public static final double COST = 10.00;

    /**
     * Default constructor that initializes room to null
     */
    public FoodBar() {
        room = null;
    }

    /**
     * Implements Decorator Pattern by allowing MotelRoom to be added to
     * parameterized constructor
     * @param room
     */
    public FoodBar(MotelRoom room) {
        this.room = room;
    }

    /**
     * Adds description of amenity, FoodBar, on top of room description
     * @return description of room and amenities
     */
    public String getDescription() {
        return room.getDescription() + ", Food Bar";
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
