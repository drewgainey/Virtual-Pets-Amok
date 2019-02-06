package VPAmok;

import java.util.Scanner;

public class App {

	static Scanner input = new Scanner(System.in);
	private static PetShelter myShelter = new PetShelter();

	public static void main(String[] args) {

		OrganicDog dog = new OrganicDog("Bob");
		RobotDog roboDog = new RobotDog("Bill");
		OrganicCat cat = new OrganicCat("Garfield");
		RobotCat roboCat = new RobotCat("Robo Cat");
		myShelter.addPet(dog);
		myShelter.addPet(roboDog);
		myShelter.addPet(cat);
		myShelter.addPet(roboCat);

		while (true) {
			System.out.println("   ___          _                 _______ __         ____               ");
			System.out.println("   /   |  ____  (_)___ ___  ____ _/ / ___// /_  ___  / / /____  _____");
			System.out.println("  / /| | / __ \\/ / __ `__ \\/ __ `/ /\\__ \\/ __ \\/ _ \\/ / __/ _ \\/ ___/");
			System.out.println(" / ___ |/ / / / / / / / / / /_/ / /___/ / / / /  __/ / /_/  __/ /    ");
			System.out.println("/_/  |_/_/ /_/_/_/ /_/ /_/\\__,_/_//____/_/ /_/\\___/_/\\__/\\___/_/    ");
			System.out.println("Here is a list of our current pets and their needs ");
			System.out.format("%10s %11s %10s %10s %10s %10s %10s %10s %10s", "Name:", "Type", "Health", "Happiness",
					"Oil Level", "Thirst", "Hunger", "Waste", "Cage Dirt");
			System.out.println();
			myShelter.printPets();
			System.out.println("Current Cleanliness of Litter box:" + LitterBox.getWaste());
			System.out.println("");
			System.out.println("What would you like to do with our pets?");
			getOptions();
			int choice = input.nextInt();
			elvaulateChoice(choice);
			myShelter.tick();
		}

	}

	private static void getOptions() {
		System.out.println("1. Feed all of the organic pets");
		System.out.println("2. Oil all of the robot animals");
		System.out.println("3. Give the pets something to drink");
		System.out.println("4. Play with the cats");
		System.out.println("5. Walk the dogs");
		System.out.println("6. Have the cats use the litter box");
		System.out.println("7. Clean the litter Box");
		System.out.println("8. Clean all of the dog cages");
		System.out.println("9. Admit another pet to the shelter");
		System.out.println("10. Quit");

	}

	private static void elvaulateChoice(int choice) {
		switch (choice) {
		case 1:
			myShelter.feed();
			break;
		case 2:
			myShelter.changeAllOil();
			break;
		case 3:
			myShelter.giveWater();
			break;
		case 4:
			myShelter.playWithCats();
			break;
		case 5:
			myShelter.walkDogs();
			break;
		case 6:
			myShelter.catsUseBox();
			break;
		case 7:
			LitterBox.clean();
			break;
		case 8:
			myShelter.cleanCages();
			break;
		case 9:
			addPet();
			break;
		case 10:
			System.exit(0);
		}

	}

	private static void addPet() {
		System.out.println("What type of pet is this?");
		System.out.println("Press 1 for Organic Dog");
		System.out.println("Press 2 for Robot Dog");
		System.out.println("Press 3 for Organic Cat");
		System.out.println("Press 4 for Robot Dog");
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			System.out.println("What is the pet's name");
			String name = input.nextLine();
			input.nextLine();
			OrganicDog dog = new OrganicDog(name);
			myShelter.addPet(dog);
			break;
		case 2:
			System.out.println("What is the pet's name");
			name = input.nextLine();
			input.nextLine();
			RobotDog roboDog = new RobotDog(name);
			myShelter.addPet(roboDog);
			break;
		case 3:
			System.out.println("What is the pet's name");
			name = input.nextLine();
			input.nextLine();
			OrganicCat cat = new OrganicCat(name);
			myShelter.addPet(cat);
			break;
		case 4:
			System.out.println("What is the pet's name");
			name = input.nextLine();
			input.nextLine();
			RobotCat roboCat = new RobotCat(name);
			myShelter.addPet(roboCat);
			break;
		}
	}
}
