
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

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

	public void removePet(String petAdopt) {
		pets.remove(petAdopt);
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

	public void tick(VirtualPet petpet) {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) pet;
				organicDog.tick();
			} else if (pet instanceof OrganicCat) {
				OrganicCat organicCat = (OrganicCat) pet;
				organicCat.tick();
			} else if (pet instanceof Robot) {
				Robot robot = (Robot) pet;
				robot.tick();
			}
		}
	}

	public boolean hasPets() {
		return !pets.isEmpty();
	}

	public void showPets(VirtualPet pet) {
		for (Entry<String, VirtualPet> entry : pets.entrySet()) {
			entry.getValue();
			System.out.println("Name:" + entry.getKey());
		}
	}

}
