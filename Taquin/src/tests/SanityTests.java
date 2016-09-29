package tests;

import org.junit.Test;

import grid.model.Case;
import grid.model.Grid;

public class SanityTests {

	@Test
	public void test1_NewGrid_VerifyPositions() {
		Grid g = new Grid();
		System.out.println(g);
		for (int i=0; i<16; i++){
			System.out.println("Search for value: " + String.valueOf(i));
			System.out.println(g.getCaseByKey(i).getPos());
		}
	}
	
	@Test
	public void test2_VerifForCaseIsMovable(){
		Grid g = new Grid();
		System.out.println(g);
		Case c = g.getCaseByKey(5);
		System.out.println("TEST");
		System.out.println(c.isMovable(g));
	}

}
