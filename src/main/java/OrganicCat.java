
public class OrganicCat extends Organic {
	int hunger = 50;
	int thirst = 50;
	int cleanliness = 100;

	public OrganicCat(String name, String description, int hunger, int thirst, int boredom, int waste, int happiness,
			int cleanliness) {
		super(name, description, hunger, thirst, boredom, waste, happiness);
		this.cleanliness = cleanliness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getCleanliness() {
		return cleanliness;
	}

	@Override

	public void tick() {
		cleanliness -= 10;
		hunger += 5;
		thirst += 5;
	}

	public void feed() {
		hunger -= 15;
	}

	public void water() {
		thirst -= 15;
	}

	public void emptyLitterBox() {
		cleanliness = 100;
	}

}
