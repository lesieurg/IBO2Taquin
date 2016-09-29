package grid.model;

public class Case{
	
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
	
	public boolean isInGrid(){
		boolean x0 = (pos.getX() >= 0);
		boolean x4 = (pos.getX() < 4);
		boolean y0 = (pos.getY() >= 0);
		boolean y4 = (pos.getY() < 4);
		System.out.println("isInGrid method OK");
		return x0&&x4&&y0&&y4;
	}
	
	public boolean isMovable(Grid g){
		System.out.println("isMovable step1");
		int X = this.getPos().getX();
		int Y = this.getPos().getY();
		System.out.println("isMovable step2");
		Case topLeft = g.getCaseByPos(new Position(X-1,Y-1));
		System.out.println(topLeft);
		Case top = g.getCaseByPos(new Position(X-1,Y));
		Case topRight = g.getCaseByPos(new Position(X-1,Y+1));
		Case right = g.getCaseByPos(new Position(X,Y+1));
		Case bottomRight = g.getCaseByPos(new Position(X+1,Y+1));
		Case bottom = g.getCaseByPos(new Position(X+1,Y));
		Case bottomLeft = g.getCaseByPos(new Position(X+1,Y-1));
		Case left = g.getCaseByPos(new Position(X,Y-1));
		System.out.println("isMovable step3");
		boolean topLeftIsInGrid = topLeft.isInGrid();
		boolean topIsInGrid = top.isInGrid();
		boolean topRightIsInGrid = topRight.isInGrid();
		boolean rightIsInGrid = right.isInGrid();
		boolean bottomRightIsInGrid = bottomRight.isInGrid();
		boolean bottomIsInGrid = bottom.isInGrid();
		boolean bottomLeftIsInGrid = bottomLeft.isInGrid();
		boolean leftIsInGrid = left.isInGrid();
		System.out.println("isMovable step4");
		boolean topLeftIsEmptyBox = (topLeft.getKey()==0);
		boolean topIsEmptyBox = (top.getKey()==0);
		boolean topRightIsEmptyBox = (topRight.getKey()==0);
		boolean rightIsEmptyBox = (right.getKey()==0);
		boolean bottomRightIsEmptyBox = (bottomRight.getKey()==0);
		boolean bottomIsEmptyBox = (bottom.getKey()==0);
		boolean bottomLeftIsEmptyBox = (bottomLeft.getKey()==0);
		boolean leftIsEmptyBox = (left.getKey()==0);
		System.out.println("isMovable step5");
		boolean topLeftOk = topLeftIsInGrid && topLeftIsEmptyBox;
		boolean topOK = topIsInGrid && topIsEmptyBox;
		boolean topRightOK = topRightIsInGrid && topRightIsEmptyBox;
		boolean rightOK = rightIsInGrid && rightIsEmptyBox;
		boolean bottomRightOK = bottomRightIsInGrid && bottomRightIsEmptyBox;
		boolean bottomOK = bottomIsInGrid && bottomIsEmptyBox;
		boolean bottomLeftOK = bottomLeftIsInGrid && bottomLeftIsEmptyBox;
		boolean leftOK = leftIsInGrid && leftIsEmptyBox;
		System.out.println("isMovable step6");
		return (topLeftOk || topOK || topRightOK || rightOK || bottomRightOK || bottomOK || bottomLeftOK || leftOK);
	}

}
