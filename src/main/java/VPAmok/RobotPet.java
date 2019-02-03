package VPAmok;

public abstract class RobotPet extends Pet {

	protected static final int DEFAULT_OIL_LEVEL = 100;
	protected int oilLevel;

	public RobotPet(String name) {
		super(name);
		this.oilLevel = DEFAULT_OIL_LEVEL;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void changeOil() {
		this.oilLevel = 100;
		
	}

}