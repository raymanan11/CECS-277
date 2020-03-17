import java.io.*;

public class Lab_11 {
    public static void main(String[] args) throws IOException {
        File f = new File("labInput.txt");
        System.out.println(f.getAbsolutePath());
        BufferedReader reader = new BufferedReader(new FileReader(new File("labInput.txt").getAbsolutePath()));
        PrintWriter out = new PrintWriter(new File("labOutput.txt").getAbsolutePath());
        String curLine = reader.readLine();
        do {
            out.println(curLine);
            curLine = reader.readLine();
        } while(curLine != null);
        reader.close();
        out.close();
    }
}
