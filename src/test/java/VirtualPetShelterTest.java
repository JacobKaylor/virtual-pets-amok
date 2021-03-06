import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private VirtualPetShelter underTest;

	private VirtualPet pet;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();

		pet = new VirtualPet("jim", "large", 50, 50, 50, 50, 50);
	}

	@Test
	public void shouldAddPet() {
		underTest.add(pet);

		VirtualPet retrieved = underTest.findPet("jim");
		assertThat(retrieved, org.hamcrest.Matchers.is(pet));
	}

	@Test
	public void shouldAddMultiplePets() {
		VirtualPet anotherPet = new VirtualPet("jerry", "large");

		underTest.add(pet);
		underTest.add(anotherPet);

		Collection<VirtualPet> pets = underTest.pets();

		assertThat(pets, org.hamcrest.Matchers.containsInAnyOrder(pet, anotherPet));

		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}

	@Test
	public void shouldPlayWithOnePet() {
		underTest.add(pet);
		underTest.playWithPet(pet);
		int newPlay = 35;

		assertEquals(newPlay, pet.getBoredom());
	}

	@Test
	public void shouldOilAllRoboticPets() {
		RoboDog roboDog = new RoboDog("metal", "small", 50, 50, 50);
		underTest.add(roboDog);
		underTest.oilAllRoboticPets();
		int newHealth = 65;
		int newHappiness = 55;
		assertEquals(newHealth, roboDog.getHealth());
		assertEquals(newHappiness, roboDog.getHappiness());
	}

	@Test
	public void shouldFeedAllOrganicPets() {
		OrganicDog organicDog = new OrganicDog("Oscar", "lazy", 50, 50, 50, 50, 50, 50);
		underTest.add(organicDog);
		underTest.feedAllOrganicPets();
		int newHunger = 35;
		assertEquals(newHunger, organicDog.getHunger());
	}

	@Test
	public void shouldWaterAllOrganicPets() {
		OrganicDog organicDog = new OrganicDog("Oscar", "lazy", 50, 50, 50, 50, 50, 50);
		underTest.add(organicDog);
		underTest.waterAllOrganicPets();
		int newThirst = 35;
		assertEquals(newThirst, organicDog.getThirst());
	}

	@Test
	public void shouldCleanAllCages() {
		OrganicDog organicDog = new OrganicDog("Oscar", "lazy", 50, 50, 50, 50, 50, 50);
		underTest.add(organicDog);
		underTest.cleanAllCages();
		int clean = organicDog.getCleanliness();
		assertEquals(100, clean);
	}

	@Test
	public void shouldEmptyLitterBox() {
		OrganicCat organicCat = new OrganicCat("Oscar", "lazy", 50, 50, 50, 50, 50, 50);
		underTest.add(organicCat);
		underTest.emptyLitterBox();
		int clean = organicCat.getCleanliness();
		assertEquals(100, clean);
	}

}
