/**
 * A more interesting use of IO decorators.
 */
package DecoratorLab;
import java.io.*;

public class IO
{
 public static void main(String[] args) throws IOException {
  InputStream is = new CaesarShiftInputStream(new BufferedInputStream(new FileInputStream("file.txt")));
  int c;

  while ( (c = is.read()) >= 0)
   System.out.print((char)c);
 }
}
