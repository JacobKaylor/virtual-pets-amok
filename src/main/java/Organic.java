
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
	}
	public void water() {
		thirst -= 15;
	}
	public void waste() {
		setWaste(getWaste() - 20);
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}
	
	

}
