import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet pets = new OrganicDog("Oscar", "large", 50, 50, 50, 50, 50, 50);
		VirtualPetShelter myShelter = new VirtualPetShelter();
		myShelter.add(pets);
		VirtualPet organicCat = new OrganicCat("Lola", "annoying", 50, 50, 50, 50, 50, 50);
		myShelter.add(organicCat);
		VirtualPet roboCat = new RoboCat("Brutus", "powerful", 50, 50, 50);
		myShelter.add(roboCat);
		VirtualPet roboDog = new RoboDog("Dog", "fun", 50, 50, 50);
		myShelter.add(roboDog);

		System.out.println("Welcome to the Pet Shelter!");
		String menu = "\nWhat would you like to do now?\n" + "\n" + "1. Feed the organic pets\n"
				+ "2. Water the organic pets\n" + "3. Clean the dog cages\n" + "4. Clean the litter box\n"
				+ "5. Walk the dogs\n" + "6. Oil the robotic pets \n" + "7. Adopt a pet\n" + "8. Admit a pet\n"
				+ "9. Show all pets\n" + "10. Quit";

		String choice;

		while (myShelter.hasPets()) {
			do {
				System.out.println(menu);
				choice = input.next();
				switch (choice) {
				case "1":
					myShelter.tick(pets);
					myShelter.feedAllOrganicPets();
					System.out.println("All organic pets have been fed!");
					break;
				case "2":
					myShelter.tick(pets);
					myShelter.waterAllOrganicPets();
					System.out.println("All organic pets have been given water!");
					break;
				case "3":
					myShelter.tick(pets);
					myShelter.cleanAllCages();
					System.out.println("All dog cages have been cleaned.");
					break;
				case "4":
					myShelter.tick(pets);
					myShelter.emptyLitterBox();
					System.out.println("The litterbox has been cleaned.");
					break;
				case "5":
					myShelter.tick(pets);
					myShelter.walkDogs();
					System.out.println("All dogs have been walked.");
					break;
				case "6":
					myShelter.tick(pets);
					myShelter.oilAllRoboticPets();
					System.out.println("All robotic pets have been given oil.");
					break;
				case "7":
					myShelter.tick(pets);
					System.out.println("Which pet would you like to play with?");
					myShelter.showPets(pets);
					System.out.println("Which pet would you like to adopt?");
					String lostPet = input.next();
					myShelter.removePet(lostPet);
					System.out.println(lostPet + " has been adopted!");
					break;
				case "8":
					myShelter.tick(pets);
					System.out.println(
							"What kind of pet do you have: \nA. Organic Dog \nB. Organic Cat\nC. Robot Dog\nD.Robot Cat");
					String petType = input.next();
					switch (petType.toUpperCase()) {
					case "A":
						System.out.println("What will the new pets name be?");
						String organicDogName = input.next();
						System.out.println("Give a description for your new pet.");
						String oDogDescription = input.next();
						VirtualPet newOrganicDog = new OrganicDog(organicDogName, oDogDescription, 50, 50, 50, 50, 50,
								50);
						myShelter.add(newOrganicDog);
						break;
					case "B":
						System.out.println("What will the new pets name be?");
						String organicCatName = input.next();
						System.out.println("Give a description for your new pet.");
						String oCatDescription = input.next();
						VirtualPet newOrganicCat = new OrganicCat(organicCatName, oCatDescription, 50, 50, 50, 50, 50,
								50);
						myShelter.add(newOrganicCat);
						break;
					case "C":
						System.out.println("What will the new pets name be?");
						String robotDogName = input.next();
						System.out.println("Give a description for your new pet.");
						String rDogDescription = input.next();
						VirtualPet newRobotDog = new RoboDog(robotDogName, rDogDescription, 50, 50, 50);
						myShelter.add(newRobotDog);
						break;
					case "D":
						System.out.println("What will the new pets name be?");
						String robotCatName = input.next();
						System.out.println("Give a description for your new pet.");
						String rCatDescription = input.next();
						VirtualPet newRobotCat = new RoboCat(robotCatName, rCatDescription, 50, 50, 50);
						myShelter.add(newRobotCat);
						break;
					}
					System.out.println("You have added a new pet to the shelter!");
					break;
				case "9":
					myShelter.tick(pets);
					System.out.println("These are all the pets at the shelter");
					myShelter.showPets(pets);
					break;
				case "10":
					System.out.println("Goodbye");
					System.exit(0);
					break;
				default:
					System.out.println("Tick tock you have entered an invalid number or character.");
				}
			} while (!myShelter.hasPets());

		}
		input.close();
	}
}
