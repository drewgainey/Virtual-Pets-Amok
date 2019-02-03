package VPAmok;

public class RobotDog extends RobotPet implements Dog{

	public RobotDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happiness += 50;
		this.oilLevel -=50;
	}


}
