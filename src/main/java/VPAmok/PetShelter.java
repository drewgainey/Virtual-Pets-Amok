package VPAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	int id = 0;

	Map<Integer, Pet> pets = new HashMap<>();

	public void addPet(Pet pet) {
		id++;
		pets.put(id, pet);
	}

	public Collection<Pet> getPets() {
		Collection<Pet> allPets = pets.values();
		return allPets;
	}

	public void feed() {
		for (Pet allPets : getPets()) {
			if (allPets instanceof OrganicPet) {
				((OrganicPet) allPets).feed();
			}
		}
	}

	public void giveWater() {
		for (Pet allPets : getPets()) {
			if (allPets instanceof OrganicPet) {
				((OrganicPet) allPets).giveWater();
			}
		}
	}

	public void changeAllOil() {
		for (Pet allPets : getPets()) {
			if (allPets instanceof RobotPet) {
				((RobotPet) allPets).changeOil();
			}
		}
	}

	public void walkDogs() {
		for (Pet allPets : getPets()) {
			if (allPets instanceof Dog) {
				((Dog) allPets).walk();
			}
		}
		
	}

	public void playWithCats() {
		for (Pet allPets : getPets()) {
			if (allPets instanceof Cat) {
				((Cat) allPets).playWith();
			}
		}
	}

	public void useLitterBox(LitterBox litterBox) {
		for (Pet allPets : getPets()) {
			if (allPets instanceof OrganicCat) {
				((OrganicCat) allPets).useLitterBox();
				litterBox.useBox();
			}
		}
	}

}
