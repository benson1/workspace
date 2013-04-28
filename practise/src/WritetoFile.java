import java.util.Random;
     import java.io.*;
     public class WritetoFile
     
     {
//  Creates a file of test data that consists of     ten lines each
        //  containing ten integer values in the range 10 to 99.
        
        public static void main (String[] args) throws IOException
        {
           final int MAX = 10;
           int value;
           String file = "test.dat"; // the name of the file to write to
           Random rand = new Random();
           FileWriter fw = new FileWriter (file);
           BufferedWriter bw = new BufferedWriter (fw);
           PrintWriter outFile = new PrintWriter (bw);
           for (int line=1; line <= MAX; line++)
           {
              for (int num=1; num <= MAX; num++)
              {
                  value = rand.nextInt (90) + 10; // generates random number to write
                  outFile.print (value + "   ");  //writes variable + adds in a space 
                }
               outFile.println (); // moves to next line in file
              }
              outFile.close();  // closes the outputfile
               System.out.println ("Output file has been created: " + file);
               }
              }
