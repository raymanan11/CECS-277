package Collections_Project;
import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: Class used to create corresponding set, add words to dictionary set,
 * add words from Alice in Wonderland file to Alice set, and search for user word from Alice set
 */
public class SetManager {

    private Set<String> myList;
    private Set<String> dictionary;
    private String type;

    /**
     * Default constructor used to initialize myList and dictionary sets to be used by SetManager
     */
    public SetManager() {
        myList = null;
        dictionary = null;
    }

    /**
     * Create a TreeSet for both myList and dictionary set and print out TreeSet
     * for user to know which set program is using
     */
    public void createTreeSet() {
        myList = new TreeSet<>();
        dictionary = new TreeSet<>();
    }

    /**
     * Create a HashSet for both myList and dictionary set and print out HashSet
     * for user to know which set program is using
     */
    public void createHashSet() {
        myList = new HashSet<>();
        dictionary = new HashSet<>();
    }

    /**
     * Read dictionary words into dictionary set
     * @param alphaWords Scanner file of all the words in a dictionary
     */
    public void addToDict(Scanner alphaWords) {
        while(alphaWords.hasNext()) {
            dictionary.add(alphaWords.next());
        }
    }

    /**
     * Read Alice in Wonderland file and reformat the file to remove
     * any characters that aren't letters. Then, for each word see if it's an
     * actual word by seeing if it's in the dictionary and if it is add to set
     * @param alice Scanner file of Alice in Wonderland
     */
    public void addToAlice(Scanner alice) {
        while(alice.hasNextLine()) {
            String s = alice.nextLine();
            s = s.replaceAll("[^a-zA-z'0-9.]+", " ");
            s = s.replaceAll("[.]+", "");
            s = s.replaceAll("[\\[\\]`'_]", "");
            String[] s1 = s.split(" ");
            for(String word : s1) {
                String lowerCasedWord = word.toLowerCase();
                if(dictionary.contains(lowerCasedWord)) {
                    myList.add(lowerCasedWord.toLowerCase());
                }
            }
        }
    }

    /**
     * Used to time how long it takes for set to find a word 100 times. If word
     * is not in myList set then exit
     * @param userWord word that user enters
     */
    public void checkUserWord(String userWord) {
        for(int i = 0; i < 100; i++) {
            if(myList.contains(userWord)) {

            }
            else {
                System.out.println("Not able to find " + userWord + " from Alice in Wonderland!");
                break;
            }
        }
        System.out.println("Done!");
    }

    /**
     * Sets the type of set used
     * @param type type of set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get myList set
     * @return set of words from Alice in Wonderland
     */
    public Set<String> getMyList() {
        return myList;
    }

    /**
     * Get dictionary set
     * @return set of all words in dictionary
     */
    public Set<String> getDictionary() {
        return  dictionary;
    }

    /**
     *
     * @return what set type is being used to test program
     */
    @Override
    public String toString() {
        return "Set being used is: " + type;
    }
}
