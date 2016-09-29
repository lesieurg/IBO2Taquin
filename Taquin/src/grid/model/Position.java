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
	
	public Position getTop(){
		return (new Position(x-1,y));
	}
	
	public Position getTopRight(){
		return (new Position(x-1,y+1));
	}
	
	public Position getRight(){
		return (new Position(x,y+1));
	}
	
	public Position getBottomRight(){
		return (new Position(x+1,y+1));
	}
	
	public Position getBottom(){
		return new Position(x+1,y);
	}
	
	public Position getBottomLeft(){
		return new Position(x+1,y-1);
	}
	
	public Position getLeft(){
		return new Position(x,y-1);
	}
	
	public Position getTopLeft(){
		return new Position(x-1,y-1);
	}
	
	public String toString(){
		return "POSITION: line: " + String.valueOf(x) + " colunm: " + String.valueOf(y);
	}
	
	public boolean equals(Position other){
		if(other instanceof Position){
			return (other.getX()==x)&&(other.getY()==y);
		}
		else{
			return false;
		}
	}

}
