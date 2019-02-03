package VPAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	RobotDog underTest = new RobotDog("Robot Bob");
	
	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Robot Bob"));
	}
	@Test
	public void shouldReturnDefaultAttributes() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappiness();
		int oilLevel = underTest.getOilLevel();
		assertThat(health, is(100));
		assertThat(happiness, is(100));
		assertThat(oilLevel, is(100));
	}
	@Test
	public void shouldIncreaseHappinessBy50WhenWalked() {
		underTest.walk();
		int happy = underTest.getHappiness();
		assertThat(happy,is(150));
	}
	@Test
	public void shouldDecreaseOilLevelBy50WhenWalked() {
		underTest.walk();
		int waste = underTest.getOilLevel();
		assertThat(waste,is(50));
	}
	@Test
	public void shouldIncreaseOilLevelTo100WhenOilChanged() {
		underTest.walk();
		underTest.changeOil();
		int oilLevel = underTest.getOilLevel();
		assertThat(oilLevel,is(100));
	}
}
