package models;

public class GiantBat extends Mammals{
	int fly = 20;
	int eatHumans = 50;
	int attackTowns = 30;
//	getters
	public int getFly() {
		energyLevel -= fly;
		System.out.println("There was a giant WOOOOOSH!");
		return energyLevel;
	}
	
	public int getEatHumans() {
		energyLevel += eatHumans;
		System.out.println("Here be bat country....");
		return energyLevel;
	}
	public int getAttackTowns() {
		energyLevel -= attackTowns;
		System.out.println("The town burns...");
		return energyLevel;
	}
//	setters
	public void setFly(int fly) {
		this.fly = fly;
	}
	public void setEatHumans(int eatHumans) {
		this.eatHumans = eatHumans;
	}
	
	public void setAttackTowns(int attackTowns) {
		this.attackTowns = attackTowns;
	}
	
}
