
public class RoboDog extends Robot implements Dog{

	
	public RoboDog(String name, String description, int boredom, int health) {
		super(name, description, boredom, health);
		// TODO Auto-generated constructor stub
	}
	public void walk() {
		setBoredom(getBoredom() - 5);
	}


	

}
