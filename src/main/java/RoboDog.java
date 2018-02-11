
public class RoboDog extends Robot implements Dog{

	
	public RoboDog(String name, String description, int boredom, int health, int happiness) {
		super(name, description, boredom, health, happiness);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void walk() {
		setBoredom(getBoredom() - 5);
		setHappiness(getHappiness() + 10);
	}


	

}
