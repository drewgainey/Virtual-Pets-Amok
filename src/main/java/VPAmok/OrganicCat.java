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
		LitterBox.useBox();
	}

	@Override
	public void checkLitterBox() {
		if(LitterBox.getWaste() >= 50) {
			this.health -=10;
		}
		
	}

	@Override
	protected void tick() {
		happiness -= 5;
		thirst += 5;
		hunger += 5;
		waste += 5;
		int healthChange = LitterBox.getWaste() / 10;
		health -= healthChange;
		
	}
	
}
