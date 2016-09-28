package tests;

import grid.model.Grid;

public class newGrid {

	public newGrid() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid g = new Grid();
		System.out.println(g);
		for (int i=0; i<16; i++){
			System.out.println("Search for value: " + String.valueOf(i));
			System.out.println(g.getCaseByKey(i).getPos());
		}
	}

}
