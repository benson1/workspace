import java.util.Scanner;
import java.util.*;
public class agerange {

	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int[] age;
		 
		 int people;
		 int[] group;
		 int number = 0;
		 int end = 0;
		 
		 
		 System.out.println("how many people?");
		 people=input.nextInt();
		 age = new int[people];
		 group = new int[people];
		 for(int i=0; i<people; i++) 
		 {
			 System.out.println("age?" + (i+1));
			 age[i]=input.nextInt();
			 
			 while(end<1){
				 
				 
				 if (age[i]>(number+1) ||(age[i] <(number+10)))
					 group[i] = group[i]+1;
				 
				 else {
					 number = number+10;
					 
				 }
			 }
		 }
			 
			 
				 

	}

}
