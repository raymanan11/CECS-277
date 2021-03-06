package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Class that is an amenity, SprayResistant Shower, that is available to add to rooms using
 * Decorator Design Pattern
 */
public class SprayResistantShower extends RoomDecorator {
    private MotelRoom room;

    public static final double COST = 25.00;

    /**
     * Default constructor that initializes room to null
     */
    public SprayResistantShower() {
        room = null;
    }

    /**
     * Implements Decorator Pattern by allowing MotelRoom to be added to
     * parameterized constructor
     * @param room
     */
    public SprayResistantShower(MotelRoom room) {
        this.room = room;
    }

    /**
     * Adds description of amenity, Spray Resistant Shower, on top of room description
     * @return description of room and amenities
     */
    public String getDescription() {
        return room.getDescription() + ", Spray Resistant Shower";
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
