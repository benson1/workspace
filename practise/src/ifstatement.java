// ************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class ifstatement
{

public static void main (String[] args)
{

double currentSalary;	//	employee's current  salary
double raise;	//	amount of the raise
double newSalary = 1;	//	new salary for the employee
String performance;
String excellent ="excellent" ;	//	performance rating
String good ="good" ;	//	performance rating
String poor ="poor" ;	//	performance rating

Scanner scan = new Scanner(System.in);

System.out.print ("Enter the current salary: ");
currentSalary = scan.nextDouble();
System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
performance = scan.next();



int result1 = performance.compareTo(excellent);
int result2 = performance.compareTo(good);
int result3 = performance.compareTo(poor);

 

if (result1 == 0){
	
	raise = (currentSalary *0.06);}

else 

System.out.println("shit");

if (result2 == 0)

    raise = (currentSalary *0.04) ;
    
else 

 if (result3 == 0)
	  
	 raise = (currentSalary *0.015);
  
 else raise = 0;
  

   
newSalary = currentSalary + raise;

// Print the results
NumberFormat money = NumberFormat.getCurrencyInstance();
System.out.println();
System.out.println("Current Salary:           " + money.format(currentSalary));
System.out.println("Amount of your raise: " + money.format(raise));
System.out.println( "Your new salary:       " + money.format (newSalary) );
System.out.println();
}
}

