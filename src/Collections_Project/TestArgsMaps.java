package Collections_Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: Testing functionality of MapManager in order to determine which map, TreeMap or HashMap
 * is more efficient for loading data and searching data<br>
 * Input: Command line argument of TreeMap or HashMap that determines which map is used to test<br>
 * Output: Time for words to enter map as well as time to search map
 */
public class TestArgsMaps {
    /**
     * Depending on what user enters in command line, either HashMap or TreeMap is created and
     * tested
     * @param args
     */
    public static void main(String [] args) {

        MapManager map = new MapManager();

        try {
            if (args.length == 0) {
                System.out.println("Command line argument is empty! Please enter either TreeMap or HashMap!");
                return;
            }

            else {
                if (args[0].equals("TreeMap")) {
                    map.createTreeMap();
                    map.setType(args[0]);
                    // Print out what type of map is used
                    System.out.println(map);
                }
                else if (args[0].equals("HashMap")){
                    map.createHashMap();
                    map.setType(args[0]);
                    // Print out what type of map is used
                    System.out.println(map);
                }
                else {
                    System.out.println("Command line argument should be TreeMap or HashMap");
                    return;
                }

                System.out.println();

                // First Timing

                // reading words from file into a map with default point values as 0 until later
                Scanner in = new Scanner(new File("qNotFollowedByU.txt"));

                long startTime1 = System.nanoTime();

                // adding words into map
                map.addToMap(in);

                long estimatedTime1 = System.nanoTime() - startTime1;

                System.out.println("Time for " + args[0] + " to load words: " + estimatedTime1 + " nanoseconds.");
                System.out.println();

                // loading Scrabble.txt file into MapManager that holds character and its value
                Scanner scrabble = new Scanner(new File("Scrabble.txt"));

                // add scrabble letters and points to file
                map.addToScrabbleMap(scrabble);

                // Second timing
                long startTime2 = System.nanoTime();

                map.updateWordPoints();

                map.printOutValues();

                long estimatedTime2 = System.nanoTime() - startTime2;

                System.out.println();
                System.out.println("Time for " + args[0] + " to search map: " + estimatedTime2 + " nanoseconds.");
                System.out.println();

                in.close();
                scrabble.close();
            }
        }

        catch(FileNotFoundException exc) {
            System.out.println("Unable to find file");
            exc.printStackTrace();
        }

        catch(IllegalStateException exc) {
            System.out.println("Error: Scanner is closed!");
            exc.printStackTrace();
        }
    }
}
