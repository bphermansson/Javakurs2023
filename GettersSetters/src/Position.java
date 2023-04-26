
public class Position {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x>=0) {
			this.x = x;	// this.x = den x som finns i klassen	
		}
		else {
			this.x = 0;
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y>=0) {
			this.y = y;	// this.y = den y som finns i klassen
		}
		else {
			this.y = 0;
		}
	}
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	
}
