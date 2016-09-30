package game;

import java.util.Scanner;

import grid.model.Grid;

public class party {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		Grid g = new Grid();
		int key=1;
		
		while(key>0){
			System.out.println("Choisissez une case par sa valeur:");
			System.out.println(g);
			key = sc.nextInt();
			System.out.println(g.getCaseByKey(key));
			System.out.println("is in grid?: " + g.getCaseByKey(key).isInGrid());
			System.out.println("is movable?: " + g.getCaseByKey(key).isMovable(g));
			if(g.getCaseByKey(key).isMovable(g)){
				System.out.println("Configuration has changed...");
				/*
				 * TODO permutation from Grid
				 */
				g.move(g.getCaseByKey(key));
			}else{
				System.out.println("Case not movable, please choose another value");
			}
		}
		
	}

}
