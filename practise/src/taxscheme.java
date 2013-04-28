import java.util.Scanner;
import java.text.NumberFormat;

public class taxscheme {

	
	public static void main(String[] args) {

		double annualTax; 
		int taxcode;
		int taxThreshold;
		int weeklyPay;
		int annualgrosspay;
		
		
		
		
		Scanner scan = new Scanner(System.in);
		NumberFormat pounds =NumberFormat.getCurrencyInstance();
		
		System.out.println("what is your weekly pay?");
		weeklyPay = scan.nextInt();
		
		System.out.println("what is your Tax code?");
		taxcode = scan.nextInt();
		
		taxThreshold = 10 * taxcode;
		annualgrosspay = 52 * weeklyPay;
		
		
		while (weeklyPay !=0 && taxcode !=0) {
		
		 taxThreshold = 10*taxcode;

		
				if (annualgrosspay < taxThreshold)
					System.out.println("no need to pay tax");
				else 
					
					{
						annualTax = (((annualgrosspay - taxThreshold) *0.2)/52);
						System.out.println("this year you must pay"+pounds.format(annualTax));
					}
				
				System.out.println("what is your weekly pay?");
				weeklyPay = scan.nextInt();
				
				System.out.println("what is your Tax code?");
				taxcode = scan.nextInt();
				
		}
		
		}
		
	 
		}

	


