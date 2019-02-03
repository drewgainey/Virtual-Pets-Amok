package VPAmok;

public class OrganicDog extends OrganicPet implements Dog {

	public OrganicDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happiness += 50;
		this.waste -=50;
	}


}
