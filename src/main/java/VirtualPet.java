import java.util.ArrayList;
import java.util.List;

public class VirtualPet {

	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 50;
	private int waste = 50;
	private int health = 50;
	private int happiness = 50;
	private String name = "";
	private String description = "";

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public VirtualPet(String name, String description, int boredom, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.setBoredom(boredom);
		this.setHealth(health);
		this.setHappiness(happiness);
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int waste, int happiness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.setBoredom(boredom);
		this.waste = waste;
		this.setHappiness(happiness);
	}

	public void tick() {
	//	hunger += 3;
	//	thirst += 3;
		setBoredom(getBoredom() + 3);
	//	waste += 3;
	}

//	public int getHunger() {
//		return hunger;
//	}
//
//	public int getThirst() {
//		return thirst;
//	}

	public int getBoredom() {
		return boredom;
	}

//	public int getWaste() {
//		return waste;
//	}
	public int getHealth() {
		return health;
	}
	public int getHappiness() {
		return happiness;
	}

//	public void feed() {
//		hunger -= 15;
//		thirst += 5;
//		waste += 10;
//	}

//	public void water() {
//		thirst -= 15;
//	}

	public void play() {
		setBoredom(getBoredom() - 15);
		setHappiness(getHappiness()+5);
		setHealth(getHealth()+5);
	}

//	public void waste() {
//		waste -= 20;
//	}


	@Override
	public String toString() {
		return name + " (" + description + ")";
	}

	public String getName() {
		return name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
}