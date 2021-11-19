class Point2 {
	private int x, y; // �� ���� �����ϴ�  x, y ��ǥ
	public Point2() {
		this.x = this.y = 0;
	}
	public Point2 (int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + " , " + y + ")");
	}
}

class ColorPoint2 extends Point2 { // Point�� ��ӹ��� ColorPoint ����
	private String color; // ���� ��
	public ColorPoint2(int x , int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class SuperEx5_3 {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
		cp.showColorPoint();
	}
}