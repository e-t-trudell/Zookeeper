package main;

import models.Gorilla;
import models.GiantBat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla g1 = new Gorilla();
//		Test cases: throw things 3 times, eat bananas twice, climb once, then display energy level
		g1.getThrowThings();
		g1.getThrowThings();
		g1.getThrowThings();
//		eat
		g1.getEatBananas();
		g1.getEatBananas();
//		climb
		g1.getClimb();
//		final energy
		g1.displayEnergy();
		
		
		GiantBat gb1 = new GiantBat();
//		test cases: attack three towns,
		gb1.getAttackTowns();
		gb1.getAttackTowns();
		gb1.getAttackTowns();
//		eat two humans
		gb1.getEatHumans();
		gb1.getEatHumans();
//		fly twice
		gb1.getFly();
		gb1.getFly();
//		display energy
		gb1.displayEnergy();
	}

}
