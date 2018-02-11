
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();
	private List<String> rooms = new ArrayList<>();

	public int litterBoxLevel;

	public boolean checkIfLitterboxIsDirty() {
		if (litterBoxLevel >= 100) {
			return true;
		} else {
			return false;
		}
	}

	public void add(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public VirtualPet findPet(String petName) {

		return pets.get(petName);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public Set<String> name() {
		return pets.keySet();
	}

	public void subtract(VirtualPet pet) {
		pets.remove(pet.getName(), pet);
	}

	public void oilAllRoboticPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Robot) {
				Robot roboticPet = (Robot) pet;
				roboticPet.oilRobot();
			}
		}
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.feed();
			}
		}

	}

	public void waterAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).water();
			}
		}

	}

	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) pet;
				organicDog.cleanAllCages();
			}
		}
	}

	public void emptyLitterBox() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicCat) {
				OrganicCat organicCat = (OrganicCat) pet;
				organicCat.emptyLitterBox();
			}
		}
	}

	public void walkDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.walk();
			}

		}
	}

	public void playWithPet(VirtualPet pet) {
		pet.play();
	}

	public void tick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}
	}

}
