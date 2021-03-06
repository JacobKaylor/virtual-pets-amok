
public class Robot extends VirtualPet {

	public Robot(String name, String description, int boredom, int health, int happiness) {
		super(name, description, boredom, health, happiness);

	}

	public void oilRobot() {
		setHealth(getHealth() + 15);
		setHappiness(getHappiness() + 5);
	}

	@Override
	public void tick() {
		setHealth(getHealth() - 2);
		setHappiness(getHappiness() - 2);
	}

	public int getHealth() {
		return health;
	}

	public boolean isOiled() {
		if (getHealth() > 80) {
			return true;
		} else {
			return false;
		}
	}
}
