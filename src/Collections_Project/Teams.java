package Collections_Project;
import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: Used for the teams that participate in Scavenger hunt
 */
public class Teams {
    private List<String> list;

    /**
     * Default constructor initializes list so can be used
     */
    public Teams() {
        list = null;
    }

    /**
     * Create list as a LinkedList
     */
    public void createLinkedList() {
        list = new LinkedList<>();
    }

    /**
     * Create list as an ArrayList
     */
    public void createArrayList() {
        list = new ArrayList<>();
    }

    /**
     *
     * @return the items on the team's scavenger hunt list
     */
    public List<String> getList() {
        return list;
    }

}
