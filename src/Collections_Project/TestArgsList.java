package Collections_Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.*;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * April 9th, 2020<br>
 * Purpose: To test ListManager class that is able test the efficiency of either LinkedList
 * or ArrayList.<br>
 * Input: Command line argument of either LinkedList of ArrayList, which creates corresponding list<br>
 * Output: Time for: Iterating back and forth, loading Scavenger list to all teams, retrieving and
 * inserting an item, and getting a random word from each teams list
 */
public class TestArgsList {
    /**
     * Depending on command line argument, the list is created and tested to determine its
     * efficiency
     * @param args either LinkedList or ArrayList, and creates the corresponding set to test
     */
    public static void main(String [] args) {

        ListManager listManager = new ListManager();

        try {
            if (args.length == 0) {
                System.out.println("No command line argument! Command line argument has to be either LinkedList or ArrayList");
            }
            else {
                if (args[0].equals("LinkedList")) {
                    listManager.createLinkedList();
                    listManager.setType(args[0]);
                    // Print out what type of list is being used
                    System.out.println(listManager);
                }
                else if (args[0].equals("ArrayList")) {
                    listManager.createArrayList();
                    listManager.setType(args[0]);
                    // Print out what type of list is being used
                    System.out.println(listManager);
                }
                else {
                    System.out.println("Command line argument needs to be either LinkedList or ArrayList");
                    return;
                }

                Scanner scavengerItems = new Scanner(new File("ScavengerHunt.txt"));

                // read from Scavenger file and input them to list
                listManager.importScavengerList(scavengerItems);

                List<String> list = listManager.getMyList();
                ListIterator<String> iterator = list.listIterator();

                long startTime = System.nanoTime();

                // iterate back and forth the list
                listManager.iterate(iterator);

                long estimatedTime = System.nanoTime() - startTime;

                Scanner scnr = new Scanner(System.in);

                String stringNumTeams;
                int numTeams;

                while(true) {
                    System.out.print("How many teams do you want? ");
                    stringNumTeams = scnr.nextLine();

                    Scanner possibleNum = new Scanner(stringNumTeams);
                    if(possibleNum.hasNextInt()) {
                        if(Integer.parseInt(stringNumTeams) <= 0) {
                            System.out.println("Number of teams can't be less than 0");
                            continue;
                        }
                        else {
                            numTeams = Integer.parseInt(stringNumTeams);
                            possibleNum.close();
                        }
                        break;
                    }
                    else {
                        System.out.println("Not a number");
                    }
                }

                String listType = args[0];

                listManager.createTeams(numTeams, listType);

                long startTime2 = System.nanoTime();

                // add Scavenger items to all lists
                listManager.populateTeams(iterator);

                long estimatedTIme2 = System.nanoTime() - startTime2;

                // ask user what position in list to retrieve and insert elements
                String stringPosition;
                int position;

                while(true) {
                    System.out.print("What position do you want to retrieve and insert an element: ");
                    stringPosition = scnr.nextLine();

                    Scanner possiblePosition = new Scanner(stringPosition);
                    if(possiblePosition.hasNextInt()) {
                        if(Integer.parseInt(stringPosition) <= 0 || Integer.parseInt(stringPosition) > 100) {
                            System.out.println("Position can't be less than or equal to 0 or greater than 100");
                            continue;
                        }
                        else {
                            position = Integer.parseInt(stringPosition);
                            possiblePosition.close();
                        }
                        break;
                    }
                    else {
                        System.out.println("Not a number");
                    }
                }

                Random rand = new Random();
                int randTeamList = rand.nextInt(numTeams);
                System.out.println();

                List<Teams> allTeams = listManager.getAllTeams();
                List<String> teamList = allTeams.get(randTeamList).getList();
                System.out.println("Random Test for Team " + (randTeamList + 1));
                System.out.println("The word at position " + position + " is: "+ teamList.get(position - 1));
                System.out.println();
                System.out.println("The things before retrieving: " + "\n" + teamList);
                System.out.println("Size is: " + teamList.size());

                long startTime3 = System.nanoTime();

                // get item from position
                listManager.retrieve(position);

                long estimatedTime3 = System.nanoTime() - startTime3;

                System.out.println();
                System.out.println("The things after retrieving: " + "\n" + teamList);
                System.out.println("Size is: " + teamList.size());

                long startTime4 = System.nanoTime();

                // insert item at this position
                listManager.insert(position);

                long estimatedTime4 = System.nanoTime() - startTime4;

                System.out.println();
                System.out.println("The things are after adding: " + "\n" + teamList);
                System.out.println("Size is: " + teamList.size());

                System.out.println();
                int randomElement = rand.nextInt(100);

                long startTime5 = System.nanoTime();

                // getting random word at this position
                listManager.randomGetWord(randomElement, position);

                long estimatedTime5 = System.nanoTime() - startTime5;

                System.out.println();
                System.out.println("Time to iterate back and for the " + args[0] + ": " + estimatedTime + " nanoseconds.");
                System.out.println("Time to load each teams lists from " + args[0] + ": " + estimatedTIme2 + " nanoseconds.");
                System.out.println("Time to retrieve element " + position + " from each team: " + estimatedTime3 + " nanoseconds.");
                System.out.println("Time to insert a new element to each teams list: " + estimatedTime4 + " nanoseconds.");
                System.out.println("Time to get random word from each teams list: " + estimatedTime5 + " nanoseconds.");

                scavengerItems.close();

            }
        }

        catch(FileNotFoundException exc) {
            System.out.println(exc);
        }

        catch(IllegalStateException exc) {
            System.out.println("Error: Scanner is closed!");
            exc.printStackTrace();
        }


    }
}
