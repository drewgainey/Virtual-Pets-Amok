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

	public String getType(Pet aPet) {
		if (aPet instanceof RobotDog) {
			return "Robot Dog";
		} else if (aPet instanceof RobotCat) {
			return "Robot Cat";
		} else if (aPet instanceof OrganicCat) {
			return "Organic Cat";
		}else
			return "Organic Dog";
	}

	public Object printOilLevel(Pet aPet) {
		if (aPet instanceof RobotPet) {
			return ((RobotPet) aPet).getOilLevel();
		}
		return "N/A";
	}

	public Object printThirst(Pet aPet) {
		if (aPet instanceof OrganicPet) {
			return ((OrganicPet) aPet).getThirst();
		}
		return "N/A";
	}

	public Object printHunger(Pet aPet) {
		if (aPet instanceof OrganicPet) {
			return ((OrganicPet) aPet).getHunger();
		}
		return "N/A";
	}

	public Object printWaste(Pet aPet) {
		if (aPet instanceof OrganicPet) {
			return ((OrganicPet) aPet).getWaste();
		}
		return "N/A";
	}

	protected abstract void tick();

	public Object printCageClean(Pet aPet) {
		if (aPet instanceof OrganicDog) {
			return ((OrganicDog) aPet).getCageClean();
		}
		return "N/A";
	}

}