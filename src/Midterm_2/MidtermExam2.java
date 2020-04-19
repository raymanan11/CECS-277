package Midterm_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MidtermExam2 {
    public static void main(String[] args) {
        try {

            if(args.length < 3) {
                System.out.println("There needs to be three command line arguments! Currently you have " + args.length + " argument(s)!");
                return;
            }
            Scanner importance = new Scanner(new File(args[0]));
            Scanner strings = new Scanner(new File(args[2]));
            PrintWriter writer = new PrintWriter(args[1]);

            // ArrayList to hold strings from strings.txt
            ArrayList<String> names = new ArrayList<>();

            // added all the strings into ArrayList
            while(strings.hasNextLine()) {
                String s = strings.nextLine();
                names.add(s);
            }

            while(importance.hasNextLine()) {
                int numStrings = 0;
                String originalString = importance.nextLine();
                String s = originalString;
                // parse the string so it only leaves the words left
                s = s.replaceAll("[^a-zA-z'0-9.]+", " ");
                s = s.replaceAll("[\\[\\]`'_]", "");
                s = s.replaceAll("[.]+", "");
                String arr[] = s.split(" ");

                for(int i = 0; i < arr.length; i++) {
                    for(int j = 0; j < names.size(); j++) {
                        // if any word in nextLine() equals Lady Bracknell or Miss Prism increase number of strings
                        if(names.get(j).equals("Lady Bracknell") || names.get(j).equals("Miss Prism")) {
                            String name[] = names.get(j).split(" ");
                            if(arr[i].equals(name[0])) {
                                numStrings++;
                            }
                        }
                        // if any word in nextLine() equals a word in the names ArrayList increase number of strings
                        if(arr[i].equals(names.get(j))) {
                            numStrings++;
                        }
                    }
                }

                // if the number of strings in a line is greater than 0 then output that line to the output file
                if(numStrings > 0) {
                    writer.println(originalString);
                }
            }

            // close all Scanners and PrintWriter objects
            importance.close();
            strings.close();
            writer.close();

            System.out.println("Done!");
        }

        catch(FileNotFoundException exc) {
            System.out.println("Unable to find file!");
        }

        catch(IllegalStateException exc) {
            System.out.println("Got an error! Scanner is closed!");
        }
    }
}
