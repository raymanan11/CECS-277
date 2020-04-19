package Collections_Project;

import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: Class used to create list, add items into Scavenger item list, iterate through list,
 * add Scavenger list to other teams, retrieve and insert from team lists, get random word from
 * Scavenger list and team lists
 */
public class ListManager {
    private List<String> myList;
    private List<Teams> allTeams;
    private String type;


    /**
     * Default constructor to initialize myList and allTeams
     */
    public ListManager() {
        myList = null;
        allTeams = null;
    }

    /**
     * Create a LinkedList for both myList and allTeams as well as print it out
     * so user can see which list is being used
     */
    public void createLinkedList() {
        myList = new LinkedList<>();
        allTeams = new LinkedList<>();
    }

    /**
     * Create a ArrayList for both myList and allTeams as well as print it out
     * so user can see which list is being used
     */
    public void createArrayList() {
        myList = new ArrayList<>();
        allTeams = new ArrayList<>();
    }

    /**
     * Add the items for scavenger hunt into a list
     * @param scavengerItems scanner file of list of items found in neighborhood
     */
    public void importScavengerList(Scanner scavengerItems) {
        while(scavengerItems.hasNextLine()) {
            myList.add(scavengerItems.nextLine());
        }
    }

    /**
     * Iterate from beginning to end of list as well as end to beginning
     * @param iterator used to loop through list of scavenger items
     */
    public void iterate(ListIterator<String> iterator) {
        while(iterator.hasNext()) {
            iterator.next();
        }

        while(iterator.hasPrevious()) {
            iterator.previous();
        }
    }

    /**
     * Create the teams based on what list is being used as well as store them in list allTeams
     * @param numTeams number of teams
     * @param listType type of list used
     */
    public void createTeams(int numTeams, String listType) {
        // create Teams and add to allTeams
        for (int i = 0; i < numTeams; i++) {
            Teams t = new Teams();

            if(listType.equals("LinkedList")) {
                t.createLinkedList();
            }
            else {
                t.createArrayList();
            }

            allTeams.add(t);
        }
    }

    /**
     * Add the scavenger list to all of the other teams and shuffle the list
     * @param iterator used to loop through list of scavenger items
     */
    public void populateTeams(ListIterator<String> iterator) {
        // load all the teams with the things on scavenger hunt
        for(Teams teams : allTeams) {
            List<String> list = teams.getList();
            // iterate from beginning to end in order to add all items from
            // scavenger hunt list to team's list
            while(iterator.hasNext()) {
                list.add(iterator.next());
            }
            // shuffle items on team's list
            Collections.shuffle(list);
            // reset the iterator back to starting position in order to load
            // another team's list
            while(iterator.hasPrevious()) {
                iterator.previous();
            }
        }
    }

    /**
     * Retrieve the word located in the position of all of the Teams
     * @param position place where user wants to access
     */
    public void retrieve(int position) {
        for(Teams teams : allTeams) {
            int counter = 0;
            ListIterator<String> teamIterator = teams.getList().listIterator();
            while(teamIterator.hasNext()) {
                teamIterator.next();
                if(counter == position - 1) {
                    teamIterator.remove();
                    break;
                }
                counter++;
            }
        }
    }

    /**
     * Insert the word located in the position of all of the Teams
     * @param position place where user wants to access
     */
    public void insert(int position) {
        for(Teams teams : allTeams) {
            int counter = 0;
            ListIterator<String> teamIterator = teams.getList().listIterator();
            while(teamIterator.hasNext()) {
                if(counter == position - 1) {
                    teamIterator.add("bowling pin");
                    break;
                }

                teamIterator.next();
                if(counter == teams.getList().size() - 1) {
                    System.out.println();
                    System.out.println("Sorry, not able to find that position. Can't add that to this team!");
                    break;
                }
                counter++;
            }
        }
    }

    /**
     * Based off a random number from 0 to 99, get that word from scavenger list,
     * as well as from all of the Team's list
     * @param randomElement random position to access from list
     * @param position place where user wants to access
     */
    public void randomGetWord(int randomElement, int position) {
        int teamNumber = 1;
        myList.get(randomElement);
        for(Teams teams : allTeams) {
            if(position == 100 && randomElement == 99) {
                System.out.println("Unable to get that word! Invalid index!");
                break;
            }
            System.out.println("Word at position " + (randomElement + 1) + " for team " + teamNumber + " is: " + teams.getList().get(randomElement));
            teamNumber++;
        }
    }

    /**
     * Sets the type of list used
     * @param type type of list
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return list of scavenger items
     */
    public List<String> getMyList() {
        return myList;
    }

    /**
     *
     * @return all of the teams
     */
    public List<Teams> getAllTeams() {
        return allTeams;
    }

    /**
     *
     * @return what list is being used to test program
     */
    @Override
    public String toString() {
        return "List used is: " + type;
    }
}
