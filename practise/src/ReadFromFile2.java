import java.util.Scanner;
import java.io.*;
public class ReadFromFile2
{
//  Reads next variable from a file and prints to screen
      public static void main (String[] args) throws IOException
   {
      String number;
      Scanner fileScan, numberScan;
      fileScan = new Scanner (new File("test.dat"));
   // Read and process each line of the file
      while (fileScan.hasNext())
      {
        number = fileScan.nextLine();
         System.out.println ("value " + number);
         numberScan = new Scanner (number);
         System.out.println();
      }
   }
}
