package simpleyatzi;

public class Die {
	private static int dices[] = {0,0,0,0,0};
	
	// Give each dice a random number.
	public static void rollDices() {
		for(int i = 0; i < dices.length; i++) {
			dices[i] = (int)(Math.random()*6+1);
		}
	}
	
	public static int[] readDices() {
		for(int i = 0; i < dices.length; i++) {
			System.out.println("Dice " + i + ". Rolled: " + dices[i]);
		}
		return dices;
	}

	// Check dices if Yatzi.
	public static Boolean checkYatzi(int[] dices) {
			if(
				dices[0] == 6 && 
				dices[1] == 6 && 
				dices[2] == 6 && 
				dices[3] == 6 && 
				dices[4] == 6) {
				return true;
		}else {
			return false;
		}
	}
}
