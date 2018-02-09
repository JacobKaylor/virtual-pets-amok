import java.util.ArrayList;
import java.util.List;

public class VirtualPet {

	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 50;
	private int waste = 50;
	private String name = "";
	private String description = "";

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int waste) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
	}

	public void tick() {
		hunger += 3;
		thirst += 3;
		boredom += 3;
		waste += 3;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
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

	public void play() {
		boredom -= 15;
		thirst += 3;
		hunger++;
	}

	public void waste(int poop) {
		waste -= poop;
	}

	@Override
	public String toString() {
		return name + " (" + description + ")";
	}

	public String getName() {
		return name;
	}
}