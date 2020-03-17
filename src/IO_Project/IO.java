package IO_Project;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
    private char continueInput;
    private Scanner scnr;

    public IO() {
        continueInput = 'a';
        scnr = new Scanner(System.in);
    }

    public File writeInputFile(String inputFileName) {
        File inputFile = new File(inputFileName);

        try {
            if(!inputFileName.equals("sales.txt")) {
                throw new FileNotFoundException();
            }
            else {
                inputFile.createNewFile();
            }

            // BufferedWriter to write to input file
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));

            while(true) {
                System.out.println();
                System.out.println("Press any key to continue or press Q to quit");
                continueInput = scnr.next().charAt(0);
                continueInput = Character.toUpperCase(continueInput);

                if (continueInput != 'Q') {

                    scnr.nextLine();
                    System.out.print("Please enter name of client: ");
                    String name = scnr.nextLine();
                    System.out.print("Please enter service sold: ");
                    String service = scnr.nextLine();
                    System.out.print("Please enter amount of the sale: ");
                    int amount = scnr.nextInt();
                    System.out.print("Please enter date of event: ");
                    scnr.nextLine();
                    String date = scnr.nextLine();

                    writer.write(name + ";" + service + ";" + amount + ";" + date);
                    writer.write("\n");
                }
                else {
                    writer.close();
                    break;
                }
            }
        }

        catch(IOException excpt) {
            System.out.println("Wrong File Name!");
        }

        catch(InputMismatchException excpt) {
            System.out.println("Sale amount is not an integer!");
        }
        return inputFile;
    }

}
