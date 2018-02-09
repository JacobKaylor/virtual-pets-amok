import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldAcceptNameAndDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String asString = underTest.toString();
		assertThat(asString, org.hamcrest.Matchers.is("name (description)"));
	}

	@Test
	public void shouldAcceptNameDescriptionAndHaveDefaultAttributes() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 50, 50, 50);
		int hunger = underTest.getHunger();
		assertEquals(hunger, 50);
	}

}
