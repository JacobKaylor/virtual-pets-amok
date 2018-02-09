import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicTest {
	
	@Test
	public void shouldFeedPet() {
		Organic underTest = new Organic("","",50,50,50,50);
		underTest.feed();
		int hunger = underTest.getHunger();
		assertEquals(hunger,35);
	}
	@Test
	public void shouldWaterPet() {
		Organic underTest = new Organic("","",50,50,50,50);
		underTest.water();
		int thirst = underTest.getThirst();
		assertEquals(thirst,35);
	}
	@Test
	public void shouldMakePetUseBathroom() {
		Organic underTest = new Organic("","",50,50,50,50);
		underTest.waste();
		int waste = underTest.getWaste();
		assertEquals(waste,30);
	}

}
