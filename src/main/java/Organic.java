
public class Organic extends VirtualPet {
	
	
	private int hunger = 50;
	private int thirst = 50;
	private int waste = 50;

	public Organic(String name, String description, int boredom, int health) {
		super(name, description, boredom, health);
	}
	public Organic(String name, String description, int hunger, int thirst, int boredom, int waste) {
		super(name, description, hunger, thirst, boredom, waste);
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
		waste += 10;
	}
	public void water() {
		thirst -= 15;
	}
	public void waste() {
		waste -= 20;
	}
	
	

}
