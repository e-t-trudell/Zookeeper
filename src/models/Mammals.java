package models;

public class Mammals {
	int energyLevel = 100;

	public int displayEnergy() {
		System.out.println("Final energy Level is: " + energyLevel);
		return energyLevel;
	}

//	public int DisplayEnergy() {
//		
//	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
