package grid.model;

public class Case{
	
	private int key;
	private Position pos;

	public Case(int k, int a, int b) {
		key = k;
		pos = new Position(a, b);
	}
	
	public Case(Case case1) {
		// TODO Auto-generated constructor stub
		key = case1.getKey();
		pos = case1.getPos();
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
	
	public Case getTop(Grid g){
		if((pos.getX())<=0){
			return null;
		}
		else{
			return(g.getCaseByPos(pos.getTop()));
		}
	}
	
	public Case getTopRight(Grid g){
		if((pos.getX())<=0 || (pos.getY())>=3){
			return null;
		}
		else{
			return g.getCaseByPos(pos.getTopRight());
		}
	}
	
	public Case getRight(Grid g){
		if(pos.getY()>=3){
			return null;
		}
		else{
			return g.getCaseByPos(pos.getRight());
		}
	}
	
	public Case getBottomRight(Grid g){
		if(pos.getX()>=3 || pos.getY()>=3){
			return null;
		}else{
			return g.getCaseByPos(pos.getBottomRight());
		}
	}
	
	public Case getBottom(Grid g){
		if(pos.getX()>=3){
			return null;
		}
		else{
			return g.getCaseByPos(pos.getBottom());
		}
	}
	
	public Case getBottomLeft(Grid g){
		if(pos.getX()>=3 || pos.getY()<=0){
			return null;
		}
		else{
			return g.getCaseByPos(pos.getBottomLeft());
		}
	}
	
	public Case getLeft(Grid g){
		if(pos.getY()>=0){
			return null;
		}else{
			return g.getCaseByPos(pos.getLeft());
		}
	}
	
	public Case getTopLeft(Grid g){
		if(pos.getY()>=0 || pos.getX()<=0){
			return null;
		}else{
			return g.getCaseByPos(pos.getTopLeft());
		}
	}
		
	public boolean isInGrid(){
		return ((pos.getX() >= 0) && (pos.getX() < 4) && (pos.getY() >= 0) && (pos.getY() < 4));
	}
	
	public boolean isMovable(Grid g){
		return this.getTop(g).getKey()==0 || 
				this.getTopRight(g).getKey()==0 || 
				this.getRight(g).getKey()==0 || 
				this.getBottomRight(g).getKey()==0 || 
				this.getBottom(g).getKey()==0 || 
				this.getBottomLeft(g).getKey()==0 || 
				this.getLeft(g).getKey()==0 || 
				this.getTopLeft(g).getKey()==0;
	}
	
	public String toString(){
		return "CASE: key("+String.valueOf(key)+") " + pos.toString();
	}
	
	public boolean equals(Case other){
		if(other instanceof Case){
			return (other.getKey()==key)&&(other.getPos()==pos);
		}
		else{
			return false;
		}
	}
	
	public void permute(Case other){
		Case tmp = new Case(this);
		this.equals(other);
		other.equals(tmp);
	}

}
