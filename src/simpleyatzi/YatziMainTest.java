package simpleyatzi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YatziMainTest {

	@Test
	void isYatziWhenAllDiceMatches() {
		int dices[] = {6,6,6,6,6};
		assertTrue(Die.checkYatzi(dices));
	}
	
	@Test
	void isNotYatziWhenOneDieIsNotMatchingTheOthers() {
		int dices[] = {1,6,6,6,6};
		assertFalse(Die.checkYatzi(dices));
	}
}
