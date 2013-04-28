
import java.util.Random;
import java.util.Scanner;


public class randomgame {

	

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int numberToGuess = rand.nextInt(5);
		int numberOfTries =	1;
		
		int guess;
		
		
		System.out.println("Guess a number between 1 and 5: ");
         guess = scan.nextInt();
		while (guess != numberToGuess) 
		{
			numberOfTries++;
			System.out.println("try again");
			guess = scan.nextInt();
		}
		
		System.out.println("you guessed correctly within "+numberOfTries+" tries");
		
		}

}


