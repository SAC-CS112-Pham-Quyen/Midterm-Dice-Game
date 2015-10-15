
import java.util.Scanner;

public class Midterm_Dice_Game {

	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in );
		
		int computerNum;
		int guessNum;
		computerNum = 0 + (int) (Math.random() * 6);

		System.out.print("Dice Game\n");

		System.out.print("Dice is rolled, pick your number: ");
		guessNum = input.nextInt();
		
		if (computerNum == guessNum) {
			System.out.print("Correct you Won!, the dice number is " + computerNum);
		}
			else if  (computerNum < guessNum)
			{
				System.out.print("Sorry you lost, the dice number is " + computerNum);
			 }
		
			 else if  (computerNum > guessNum)
			 { 
				System.out.print("Too bad, the dice number is " + computerNum);
			 }	
		
		input.close();
	}		
		
}