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
	
	public Case getCaseByKey(int k){
		System.out.println("getCaseByKey method...(Key: " + k + ")");
		List<Case> l = grid.get(0);
		return this.getCaseByKey(k, l, 0);
	}
	
	public Case getCaseByKey(int k, List<Case> l, int line){
		for(Case c : l){
			if(c.getKey()==k){
				return c;
			}
		}
		if(line<grid.size()){
			return this.getCaseByKey(k, grid.get(line+1), line+1);
		}
		else{
			return null;
		}
	}
	
	public Case getCaseByPos(Position k){
		System.out.println("getCaseByPos method...(Position: " + k + ")");
		List<Case> l = grid.get(0);
		return this.getCaseByPos(k, l, 0);
	}
	
	public Case getCaseByPos(Position k, List<Case> l, int line){
		return grid.get(k.getX()).get(k.getY());
	}

}
