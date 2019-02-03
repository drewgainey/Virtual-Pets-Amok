package VPAmok;

public abstract class OrganicPet extends Pet {

	protected static final int DEFAULT_WASTE = 100;
	protected static final int DEFAULT_HUNGER = 100;
	protected static final int DEFAULT_THIRST = 100;
	protected int thirst;
	protected int hunger;
	protected int waste;


	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWaste() {
		return waste;
	}
	public OrganicPet(String name) {
		super(name);
		this.thirst = DEFAULT_THIRST;
		this.hunger = DEFAULT_HUNGER;
		this.waste = DEFAULT_WASTE;
	}

	public void feed() {
		this.hunger -=50;
	}

	public void giveWater() {
		this.thirst -=50;
	}

}