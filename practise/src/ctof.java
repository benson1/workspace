import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ctof {


	public static void main(String[] args) throws Exception {
	
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(reader);
	Scanner scan = new Scanner(System.in);
		
	double celcius = 0;
	double farenheit = 0;
	
	
	
		System.out.println("enter the value in celcius");
		celcius = scan.nextInt();
		farenheit = celcius *33.8;
		System.out.println("as farenheit that is \"" + farenheit +"\"");
		
	}

}
