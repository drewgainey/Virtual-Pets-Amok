package VPAmok;

public class OrganicCat extends OrganicPet implements Cat{

	public OrganicCat(String name) {
		super(name);
	}

	@Override
	public void playWith() {
		this.happiness +=50;
	}

	public void useLitterBox() {
		this.waste -=50;
	}
	
}
