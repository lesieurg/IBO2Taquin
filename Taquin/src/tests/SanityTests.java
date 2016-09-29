package tests;

import org.junit.Test;

import grid.model.Case;
import grid.model.Grid;

public class SanityTests {

	@Test
	public void test() {
		Grid g = new Grid();
		System.out.println(g);
		for (int i=0; i<16; i++){
			System.out.println("Search for value: " + String.valueOf(i));
			System.out.println(g.getCaseByKey(i).getPos());
//			if(g.getCaseByKey(i).isMovable()){
//				System.out.println("Case is MOVABLE");
//			}
		}
	}
	
	@Test
	public void test2(){
		Grid g = new Grid();
		System.out.println(g);
		Case c = g.getCaseByKey(5);
		System.out.println("TEST");
		System.out.println(c.isMovable(g));
	}

}
