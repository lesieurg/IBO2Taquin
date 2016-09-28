package grid.model;

public class Position {
	
	private int x;
	private int y;

	public Position(int a, int c) {
		x=a;
		y=c;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int a){
		x=a;
	}
	
	public void setY(int b){
		y=b;
	}
	
	public String toString(){
		return "*Position:*\nLine: " + String.valueOf(x) + "\nColunm: " + String.valueOf(y);
	}

}
