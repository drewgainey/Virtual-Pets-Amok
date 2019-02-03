package VPAmok;

public class OrgaincCat extends OrganicPet implements Cat{

	public OrgaincCat(String name) {
		super(name);
	}

	@Override
	public void playWith() {
		this.happiness +=50;
	}
	
}
