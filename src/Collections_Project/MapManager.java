package Collections_Project;

import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9, 2020<br>
 * Purpose: Class used to create corresponding map, add words and point values
 * to myList map, add characters and point values to scrabble map, update word
 * points, and print out values
 */
public class MapManager {

    private Map<String, Integer> myList;
    private Map<Character, Integer> scrabbleList;
    private String type;

    /**
     * Default contsructor used to initialize myList and scrabbleList maps to be used by MapManager
     */
    public MapManager() {
        myList = null;
        scrabbleList = null;
    }

    /**
     * Creates a TreeMap for myList and scrabbleList
     */
    public void createTreeMap() {
        myList = new TreeMap<>();
        scrabbleList = new TreeMap<>();
    }

    /**
     * Creates a HashMap for myList and scrabbleList
     */
    public void createHashMap() {
        myList = new HashMap<>();
        scrabbleList = new HashMap<>();
    }

    /**
     * Read all words that start with q but not followed by u into myList map as
     * as the key and a default value of 0 as the value for now
     * @param in Scanner file of words that start with q but not followed by u
     */
    public void addToMap(Scanner in) {
        while(in.hasNext()) {
            myList.put(in.next(), 0);
        }
    }

    /**
     * Read the alphabet letters and its point values into a scrabble map as
     * key and value, respectively
     * @param scrabble Scanner file of all alphabet letters and its corresponding point values
     */
    public void addToScrabbleMap(Scanner scrabble) {
        while(scrabble.hasNextLine()) {
            String s = scrabble.nextLine();
            String[] values = s.split(" ");
            Character c = values[0].charAt(0);
            Integer i = Integer.parseInt(values[1]);
            scrabbleList.put(c, i);
        }
    }

    /**
     * Update the point values of the words that start with q not followed by u
     * to its actual scrabble point values
     */
    public void updateWordPoints() {
        for (String word: myList.keySet()) {
            int wordValue = 0;
            for (int i = 0; i < word.length(); i++) {
                // gets individual characters from word and
                // from that individual character get the value from scrabble list
                int charValue = scrabbleList.get(word.toUpperCase().charAt(i));
                // add character value gotten from character key from scrabble map to word value
                wordValue = wordValue + charValue;
            }

            // update the value of the word in myList map
            myList.put(word, wordValue);
        }
    }

    /**
     * Print out the scrabble point values that are accessed by the key
     */
    public void printOutValues() {
        for (String key : myList.keySet()) {
            System.out.println(key + " --> " + myList.get(key));
        }
    }

    /**
     * Sets the type of map used
     * @param type type of map
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get myList map
     * @return myList map
     */
    public Map<String, Integer> getMyList() {
        return myList;
    }

    /**
     * Get scrabble map
     * @return scrabbleList map
     */
    public Map<Character, Integer> getScrabbleList() {
        return scrabbleList;
    }

    /**
     *
     * @return what map type is being used to test program
     */
    public String toString() {
        return "Map used is: " + type;
    }
}
