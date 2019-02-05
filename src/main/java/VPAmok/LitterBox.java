package VPAmok;

public class LitterBox {

	private int wasteLevel = 0;

	public int getWaste() {
		return wasteLevel;
	}
	public void useBox() {
		wasteLevel +=10;
	}

}
