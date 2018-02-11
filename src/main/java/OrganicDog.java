
public class OrganicDog extends Organic implements Dog {
	int hunger = 50;
	int cleanliness = 100;
	int thirst = 50;

	public OrganicDog(String name, String description, int hunger, int thirst, int boredom, int waste, int happiness) {
		super(name, description, hunger, thirst, boredom, waste, happiness);
		// TODO Auto-generated constructor stub
	}
	@Override

	public void walk() {
		setBoredom(getBoredom() - 5);
		setHappiness(getHappiness() + 10);
		setWaste(getWaste() - 15);
	}

	public void cleanAllCages() {
		cleanliness = 100;
	}

	
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

}
