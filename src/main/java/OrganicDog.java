
public class OrganicDog extends Organic implements Dog {

	public OrganicDog(String name, String description, int hunger, int thirst, int boredom, int waste, int happiness) {
		super(name, description, hunger, thirst, boredom, waste, happiness);
		// TODO Auto-generated constructor stub
	}
	public void walk() {
		setBoredom(getBoredom() - 5);
		setHappiness(getHappiness() + 10);
		setWaste(getWaste() - 15);
	}
	

}
