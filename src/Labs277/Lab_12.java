package Labs277;

import java.io.*;

public class Lab_12 {
    public static void main(String[] args) {
        if(args.length >= 2) {
            try {
                File f = new File(args[0]);
                System.out.println(f.getAbsolutePath());
                BufferedReader reader = new BufferedReader(new FileReader(new File(args[0]).getAbsolutePath()));
                PrintWriter out = new PrintWriter(new File(args[1]).getAbsolutePath());
                String curLine = reader.readLine();
                do {
                    out.println(curLine);
                    curLine = reader.readLine();
                }
                while(curLine != null);
                reader.close();
                out.close();
            }
            catch(IOException exception) {
                System.out.println("Can't find file!");
            }
        }
        else {
            System.out.println("Don't have enough arguments!");
        }

    }
}
