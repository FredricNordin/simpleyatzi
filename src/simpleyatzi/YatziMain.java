package simpleyatzi;
import java.util.Scanner;

public class YatziMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int round = 1;
		Boolean checkWin = false;
		
		// We will continue until the game is over.
		while(round <= 3 && checkWin == false) {
			System.out.println("***********Round " + round + "***********");
			System.out.println("Press Enter to roll the dices!");
			String userInput = scan.nextLine();
			Die.rollDices();
			int[] dices = (Die.readDices());
			checkWin = (Die.checkYatzi(dices));
			round++;
			
			// If player got Yatzi.
			if(checkWin) {
				System.out.println("⭐ You got Yatzi! ⭐");
				
			// Game over.
			} else if (round > 3) {
				System.out.println("💀 Game over! 💀");
				System.out.println("Press Enter to play again!");
				String userInput2 = scan.nextLine();
				round = 1;
			}
		}
	}
}