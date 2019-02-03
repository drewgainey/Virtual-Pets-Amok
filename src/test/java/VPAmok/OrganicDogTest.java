package VPAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Bob");
	
	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Bob"));
	}
	
	@Test
	public void shouldHaveDefaultAttributes() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappiness();
		int thirst = underTest.getThirst();
		int hunger = underTest.getHunger();
		int waste = underTest.getWaste();
		assertThat(health, is(100));
		assertThat(happiness, is(100));
		assertThat(thirst, is(100));
		assertThat(hunger, is(100));
		assertThat(waste, is(100));
	}
	@Test
	public void shouldIncreaseHappinessBy50WhenWalked() {
		underTest.walk();
		int happy = underTest.getHappiness();
		assertThat(happy,is(150));
	}
	@Test
	public void shouldDecreaseWasteBy50WhenWalked() {
		underTest.walk();
		int waste = underTest.getWaste();
		assertThat(waste,is(50));
	}
	@Test
	public void shouldDecreaseHungerBy50WhenFeed() {
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger,is(50));
	}
	@Test
	public void shouldDecreaseThirstBy50WhenGivenWater() {
		underTest.giveWater();
		int thirst = underTest.getThirst();
		assertThat(thirst,is(50));
	}
//	@Test 
//	public void shouldDecreaseHealthBy50WhenCageIsNotClean(){
//		Cage test = new Cage();
//		underTest.checkCage();
//		int health = underTest.getHealth();
//		assertThat(health,is(50));
//	}
}
