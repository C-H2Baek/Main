class Point3{
	private int x,y;
	public Point3(int x, int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(getX()<0||getY()<0) {
			move(0, 0);
		}
	}
	public String toString() {
		return "("+getX()+","+getY()+")"+"의 점";
	}
	protected void move(int x1, int y1) {
		if(x1<0||y1<0) {
			return;
		}
		else {
			super.move(x1, y1);
		}
	}
}

public class Solve5_8 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(5, -5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
