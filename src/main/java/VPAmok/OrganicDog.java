package VPAmok;

public class OrganicDog extends OrganicPet implements Dog {

	private int cageClean = 0;

	public OrganicDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happiness += 50;
		this.waste -=50;
	}

	@Override
	protected void tick() {
		happiness -= 5;
		thirst += 5;
		hunger += 5;
		waste += 5;
		cageClean += waste / 10;
		health -= cageClean;
	}

	public void cleanCage() {
		cageClean = 0;
	}

	public Object getCageClean() {
		return cageClean;
	}

}
