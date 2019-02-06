package VPAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RobotCatTest {

	RobotCat underTest = new RobotCat("Robot Bill");
	OrganicCat cat = new OrganicCat("Cat"); 

	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Robot Bill"));
	}
	
	@Test
	public void shouldHaveDefaultAttributes() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappiness();
		int oilLevel = underTest.getOilLevel();
		assertThat(health, is(100));
		assertThat(happiness, is(100));
		assertThat(oilLevel, is(100));
	}
	@Test
	public void shouldIncreaseHappinessBy50WhenPlayedWith() {
		underTest.playWith();
		int happy = underTest.getHappiness();
		assertThat(happy,is(150));
	}
	@Test
	public void shouldDecreaseOilLevelBy50WhenPlayedWith() {
		underTest.playWith();
		int oilLevel = underTest.getOilLevel();
		assertThat(oilLevel,is(50));
	}
	@Test
	public void shouldIncreaseOilLevelTo100WhenOilChanged() {
		underTest.playWith();
		underTest.changeOil();
		int oilLevel = underTest.getOilLevel();
		assertThat(oilLevel,is(100));
	}
	@Test
	public void shouldDecreaseHealthBy10WhenLitterBoxWasteIs50OrMore() {
		cat.useLitterBox();
		cat.useLitterBox();
		cat.useLitterBox();
		cat.useLitterBox();
		cat.useLitterBox();
		underTest.checkLitterBox();
		int health = underTest.getHealth();
		assertThat(health, is(90));
	}
}
