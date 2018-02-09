import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogTest {
	@Test
	public void shouldIncreaseHappinessWhenWalked() {
		OrganicDog underTest = new OrganicDog("","",50,50,50,50,50);
		underTest.walk();
		int walk = underTest.getHappiness();
		assertEquals(walk, 60);
	}
	public void shouldDedcreaseWasteLevelWhenWalked() {
		OrganicDog underTest = new OrganicDog("","",50,50,50,50,50);
		underTest.walk();
		int walk = underTest.getWaste();
		assertEquals(walk, 35);
	}

}
