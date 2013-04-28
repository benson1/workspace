import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputpractise {


	public static void main(String[] args) throws Exception {
	
		InputStreamReader reader = new InputStreamReader(System.in);
	    BufferedReader input = new BufferedReader(reader);
	    
	    
	    String s;
	    
	    System.out.println("input a word");
	    s = input.readLine();
	    System.out.println("you entered \"" + s + "\""); 
	  
	   Integer n;
	    
	    System.out.println("input a number");
	    s = input.readLine();
	    n = Integer.valueOf(s);
	    System.out.println("you entered the number \"" + n + "\"");
	    
	    
	}
		
		