
public class Robot extends VirtualPet{
	
	


	public Robot(String name, String description, int boredom, int health) {
		super(name, description, boredom, health);
		
	}

	public void oilAllRobots() {
		setHealth(getHealth() + 15);
	}
	public void tick() {
		setHealth(getHealth() - 2);
	}
	public boolean isOiled() {
		return true;
		
	}


	

}
