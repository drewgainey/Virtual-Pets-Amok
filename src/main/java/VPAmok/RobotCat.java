package VPAmok;

public class RobotCat extends RobotPet implements Cat {

	public RobotCat(String name) {
		super(name);
	}

	@Override
	public void playWith() {
		this.happiness +=50;
		this.oilLevel -=50;
		this.health +=50;
	}

	@Override
	public void checkLitterBox() {
		if(LitterBox.getWaste() >= 50) {
			this.health -=10;
		}
		
	}

	@Override
	protected void tick() {
		health -= 5;
		happiness -= 5;
		oilLevel -= 5;	
	}

}
