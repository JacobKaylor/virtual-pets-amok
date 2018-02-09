import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDogTest {
	
	@Test
	
	public void shouldLowerBoredomWhenWalked() {
		RoboDog underTest = new RoboDog("","",50,50);
		underTest.walk();
		int walk = underTest.getBoredom();
		assertEquals(walk, 45);
	}

}
