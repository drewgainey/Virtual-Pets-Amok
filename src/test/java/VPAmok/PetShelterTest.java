package VPAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;


public class PetShelterTest {
	
	PetShelter underTest = new PetShelter();
	OrganicDog dog = new OrganicDog("Bob");
	RobotDog roboDog = new RobotDog("Bill");
	OrganicCat cat = new OrganicCat("Garfield");
	RobotCat roboCat = new RobotCat("Robo Cat");
	
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.addPet(dog);
		Collection<Pet> pets = underTest.getPets();
		assertThat(pets, contains(dog));
	}
	@Test
	public void shouldBeAbleToAddPetsOfDifferentTypes() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		Collection<Pet> pets = underTest.getPets();
		assertThat(pets,containsInAnyOrder(dog,roboDog));
	}
	@Test 
	public void shouldBeAbleToFeedAllOrganicPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.feed();
		int dogHunger = dog.getHunger();
		int catHunger = cat.getHunger();
		assertThat(dogHunger,is(50));
		assertThat(catHunger,is(50));
	}
	@Test 
	public void shouldBeAbleToWaterAllOrganicPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.giveWater();
		int dogThirst = dog.getThirst();
		int catThirst = cat.getThirst();
		assertThat(dogThirst,is(50));
		assertThat(catThirst,is(50));
	}
	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.walkDogs();
		int dogHappiness = dog.getHappiness();
		int roboDogHappiness = roboDog.getHappiness();
		assertThat(dogHappiness,is(150));
		assertThat(roboDogHappiness,is(150));
	}
	@Test
	public void shouldBeAbleToPlayWithAllCats() {
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.playWithCats();
		int catHappiness = cat.getHappiness();
		int roboCatHappiness = cat.getHappiness();
    	assertThat(catHappiness,is(150));
    	assertThat(roboCatHappiness,is(150));
	}
	
	@Test 
	public void shouldBeAbleToChangeOilInAllRobotPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.walkDogs();
		underTest.playWithCats();
		underTest.changeAllOil();
		int dogOilLevel = roboDog.getOilLevel();
		int catOilLevel = roboCat.getOilLevel();
		assertThat(dogOilLevel,is(100));
		assertThat(catOilLevel,is(100));
	}
}
