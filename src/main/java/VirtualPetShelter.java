
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

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

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feed();
		}

	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.water();
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
