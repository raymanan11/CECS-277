package Collections_Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: Test and use SetManager to find out which set is more efficient at
 * loading data and searching data, HashSet or TreeSet<br>
 * Input: Command line argument, TreeSet or HashSet which determines which set is used to test the efficiency<br>
 * Output: Time to enter alice file to set and search for a word 100 times
 */
public class TestArgsSets {
    /**
     * Depending on what user enters in command line, either HashMap or TreeMap is created and
     * tested
     * @param args either TreeSet or HashSet, and creates the corresponding set to test
     */
    public static void main(String [] args) {

        SetManager setManager = new SetManager();

        try {
            if (args.length == 0) {
                System.out.println("Command line argument is empty! Please enter either TreeSet or HashSet!");
            }

            else {
                if (args[0].equals("TreeSet")) {
                    setManager.createTreeSet();
                    setManager.setType(args[0]);
                    // Print out type of set being used
                    System.out.println(setManager);
                }
                else if (args[0].equals("HashSet")){
                    setManager.createHashSet();
                    setManager.setType(args[0]);
                    // Print out what type of set being used
                    System.out.println(setManager);
                }
                else {
                    System.out.println("Command line argument should either be TreeSet or HashSet");
                    return;
                }

                Scanner alphaWords = new Scanner(new File("words_alpha.txt"));

                // add words from alphabet to dictionary set
                setManager.addToDict(alphaWords);

                Scanner alice = new Scanner(new File("Alice.txt"));

                long startTime = System.currentTimeMillis();

                // add words from alice file and parse it to get all words in set
                setManager.addToAlice(alice);

                long estimatedTime = System.currentTimeMillis() - startTime;

                System.out.println("Time to enter words to " + args[0] + ": " + estimatedTime + " milliseconds.");
                System.out.println();

                Scanner scnr = new Scanner(System.in);
                System.out.print("Please enter the word that you want to search for: ");
                String userWord = scnr.next();
                userWord = userWord.toLowerCase();

                long startTime2 = System.nanoTime();

                // check if the word user entered is a word alice file
                setManager.checkUserWord(userWord);

                long estimatedTime2 = System.nanoTime() - startTime2;

                Set<String> finishedList = setManager.getMyList();

                if(finishedList.contains(userWord)) {
                    System.out.println("Time for " + args[0] + " to search word 100 times: " + estimatedTime2 + " nanoseconds.");
                }

                alphaWords.close();
                alice.close();
            }
        }

        catch(FileNotFoundException exc) {
            System.out.println("Unable to find the file");
        }

        catch(IllegalStateException ecx) {
            System.out.println("Error! Scanner is closed!");
            ecx.printStackTrace();
        }
    }
}
