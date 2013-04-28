
import java.util.Scanner;
public class armsdealercomssion {

	
	public static void main(String[] args) {
		
		int paygrade;
		double commissionRate = 0;
		int tanksSold;
		int pricepertank = 0;
		int commission;
		
		commission = (int) (commissionRate+pricepertank);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter paygrade");
        paygrade = scan.nextInt();
        
        System.out.println("enter quantity of tanks sold");
        tanksSold = scan.nextInt();
        
        System.out.println("enter price per tank");
        pricepertank = scan.nextInt();
        
        System.out.println("enter commisionRate");
        commissionRate = scan.nextInt();
        
        
        if (paygrade == 1)
        	commissionRate = 500 + 0.045*tanksSold;
        	
        
        
        }
      
        
	
      
	}


