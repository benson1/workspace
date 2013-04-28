
import java.text.NumberFormat;
import java.util.Scanner;
public class taxtest {

	public static void main(String[] args) {
		
     int number = 0;
     int divisor = 0;
     int remainder = 0;
     
     Scanner scan = new Scanner(System.in);
     NumberFormat pounds =NumberFormat.getCurrencyInstance();
     
     System.out.println("enter negative int");
     number = scan.nextInt();
     
     System.out.println("enter devisor");
     divisor = scan.nextInt();
     
     
     
     
    	 remainder = (number % divisor);
    	 
    
     
     System.out.println("the remainder is " + remainder);
	}

}
