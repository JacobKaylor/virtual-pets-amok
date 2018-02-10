
public class Organic extends VirtualPet {
	
	
	private int hunger = 50;
	private int thirst = 50;
	private int waste = 50;

	public Organic(String name, String description, int hunger, int thirst, int boredom, int waste, int happiness) {
		super(name, description, hunger, thirst, boredom, waste, happiness);
	}
	
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}
	public int getWaste() {
		return waste;
	}
	public void feed() {
		hunger -= 15;
		thirst += 5;
		setWaste(getWaste() + 10);
		setHealth(getHealth()+5);
		setHappiness(getHappiness()+2);
	}
	public void water() {
		thirst -= 15;
		setHealth(getHealth()+5);
		setHappiness(getHappiness()+2);
	}
	public void waste() {
		setWaste(getWaste() - 20);
		setHappiness(getHappiness()+2);
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}
	public void tick() {
		setHealth(getHealth()-5);
		setHappiness(getHappiness()-5);
		hunger += 5;
		thirst += 5;
		setWaste(getWaste()-5);
	}
	
	

}
