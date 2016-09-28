package grid.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A grid is a frame composed by several Cases and their Position
 * @author adrianpothuaud
 *
 */

public class Grid {
	
	List<ArrayList<Case>> grid = new ArrayList<ArrayList<Case>>();
	
	public Grid(){
		List<Integer> tmplist = new ArrayList<Integer>();
		int cpt = 0;
		while(cpt<16){
			Random rdm = new Random();
			int tmp = rdm.nextInt() % 16;
			if(tmp<0){
				tmp = - tmp;
			}
			if (!tmplist.contains(tmp)){
				tmplist.add(tmp);
				cpt++;
			}
		}
		for (int i=0; i<4; i++){
			grid.add(i, new ArrayList<Case>());
			for (int j=0; j<4; j++){
				grid.get(i).add(new Case(tmplist.get(4*i+j),i,j));
			}
		}
	}
	
	public String toString(){
		String tmp = "";
		for (List<Case> i : grid){
			for(Case j : i){
				tmp+="|| ";
				if(j.getKey()/10==0){
					tmp += " ";
				}
				tmp += String.valueOf(j.getKey());
				tmp+=" ";
			}
			tmp += "||\n";
		}
		return tmp;
	}
	
	
	
}
