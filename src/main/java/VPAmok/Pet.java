package VPAmok;

public abstract class Pet {

	protected static final int DEFAULT_HAPPINESS = 100;
	protected static final int DEFAULT_HEALTH = 100;
	protected String name;
	protected int health;
	protected int happiness;

	public Pet(String name) {
		this.name = name;
		this.health = DEFAULT_HEALTH;
		this.happiness = DEFAULT_HAPPINESS;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}


}