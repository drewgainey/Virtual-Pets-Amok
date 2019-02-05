package VPAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class LitterBoxTest {

	LitterBox underTest = new LitterBox();
	
	PetShelter shelter = new PetShelter();
	OrganicCat cat = new OrganicCat("Garfield");

	@Test
	public void shouldBeAbleToIncreaseWasteLevelInLitterBox() {
		shelter.addPet(cat);
		shelter.useLitterBox(underTest);
		int wasteLevel = underTest.getWaste();
		assertThat(wasteLevel, is(10));
	}
}
