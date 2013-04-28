import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

   public static void main(String[] args) throws Exception
   {
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader input = new BufferedReader(reader);

      String s;

      System.out.print("Enter some text: ");
      s = input.readLine();
      System.out.println("You typed \"" + s + "\"");

      int n;

      System.out.print("Enter a number: ");
      s = input.readLine();
      n = Integer.valueOf(s);
      System.out.println("You entered the number " + n);
   }
}
