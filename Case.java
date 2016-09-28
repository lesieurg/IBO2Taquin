package grid.model;

public class Case {
	
	private int key;
	private Position pos;

	public Case(int k, int a, int b) {
		
		key = k;
		pos = new Position(a, b);
		
	}
	
	public int getKey(){
		return key;
	}
	
	public void setKey(int x){
		key=x;
	}
	
	public Position getPos(){
		return pos;
	}
	
	public void setPos(int a, int b){
		pos.setX(a);
		pos.setY(b);
	}

}
