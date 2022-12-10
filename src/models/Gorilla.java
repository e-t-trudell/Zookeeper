package models;

public class Gorilla extends Mammals{
	int throwThings = 5;
	int eatBananas = 10;
	int climb = 10;
	public int getThrowThings() {
		energyLevel -= throwThings;
		System.out.println("The gorilla threw somethings!");
		return energyLevel;
	}
	
	public int getEatBananas() {
		energyLevel += eatBananas;
		System.out.println("Satisfaction has increased");
		return energyLevel;
	}
	
	public int getClimb() {
		energyLevel -= climb;
		System.out.println("The gorilla climbed a tree!");
		return energyLevel;
	}
	public void setThrowThings(int throwThings) {
		this.throwThings = throwThings;
	}
	public void setEatBananas(int eatBananas) {
		this.eatBananas = eatBananas;
	}
	public void setClimb(int climb) {
		this.climb = climb;
	}
	
	
}
