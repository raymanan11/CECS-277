package TermProject;
/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Class that is used to implement the Decorator Design Pattern for amenities
 */
public abstract class RoomDecorator extends MotelRoom {

    /**
     * Default Constructior
     */
    public RoomDecorator() {

    }

    /**
     * abstract method that is needed for amenities to implement in order for decorator pattern to be used
     * @return
     */
    public abstract String getDescription();

    /**
     *
     * @return purpose of class
     */
    @Override
    public String toString() {
        return "Room Decorator";
    }
}
