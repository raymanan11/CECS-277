package IO_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class IO_Tester {
    public static void main(String[] args) throws FileNotFoundException {
        // Ask user for input and output file names
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input file name: ");
        String inputFileName = scnr.next();

        // Arraylist that uses a loop and creates output files from command line argument
        ArrayList<PrintWriter> outputFiles = new ArrayList<>();
        for(int i = 0; i < args.length; i++) {
            outputFiles.add(new PrintWriter(args[i]));
        }

        // ask user to input data, then have access to data file by variable completedFile
        IO io = new IO();
        File doneInputFile = io.writeInputFile(inputFileName);

        // ArrayList to hold all created PrintWriters used to close them
        ArrayList<PrintWriter> finishedPrintWriter = new ArrayList<>();

        try {
        // Scanner object for reading
        Scanner in = new Scanner(doneInputFile);

        in.useDelimiter(";");

            while(in.hasNextLine()) {
                // gets an entire line in file and saves as string
                String s = in.nextLine();

                // splits string and gets service
                String[] sArr = s.split(";");
                String service = sArr[1];

                for(int i = 0; i < args.length; i++) {
                    String fileName = args[i];
                    // creates PrintWriter used to print to output file
                    PrintWriter p = outputFiles.get(i);
                    // adds to ArrayList used to close PrintWriter objects
                    finishedPrintWriter.add(p);
                    int period = fileName.indexOf(".");
                    fileName = fileName.substring(0, period);
                    /** checks every argument and if service equals fileName then print
                     *  to file then break
                     */
                    if(service.equals(fileName)) {
                        p.println(s);
                        break;
                    }

                    /** this case is reached because service never equals file name
                     * and never breaks out of for loop so its not a valid transaction
                     * so UnknownTransactionException is thrown
                     */
                    else if(i == args.length - 1) {
                        throw new UnknownTransactionException("Can't find the transaction: " + service);
                    }
                }
            }

            // closes all PrintWriter objects
            for(int i = 0; i < finishedPrintWriter.size(); i++) {
                PrintWriter pw = finishedPrintWriter.get(i);
                pw.close();
            }

            in.close();

        }

        catch (UnknownTransactionException excpt) {
            System.out.println(excpt);
        }

        catch(FileNotFoundException excpt) {
            System.out.println("Unable to create file to be read");
            System.out.println("File needs to be named sales.txt");
        }
    }
}
