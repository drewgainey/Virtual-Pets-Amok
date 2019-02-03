package VPAmok;

public class RobotCat extends RobotPet implements Cat {

	public RobotCat(String name) {
		super(name);
	}

	@Override
	public void playWith() {
		this.happiness +=50;
		this.oilLevel -=50;
	}

}
