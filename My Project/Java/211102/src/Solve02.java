
class Rectangle{
	private int x1,y1,x2,y2;
	Rectangle(){
		x1=0;y1=0;x2=0;y2=0;
	}
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1=x1;this.y1=y1;this.x2=x2;this.y2=y2;
	}
	void set(int x1, int y1, int x2, int y2) {
		this.x1=x1;this.y1=y1;this.x2=x2;this.y2=y2;
	}
	int square() {
		int area = (x2-x1) * (y2-y1);
		if(area<0) {
			return -area;
		}
		else return area;
	}
	void show() { 
		System.out.println("("+x1+","+y1+")"+","+"("+x2+","+y2+")");
		System.out.println("����:" + this.square());
	}
	boolean equals(Rectangle r) { // ���̰� ������?
		if(this.square() == r.square())
			return true;
		else
			return false;
	}
}
public class Solve02{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, -2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s)) {
			System.out.println("�� �簢���� ���̰� �����ϴ�.");
		}
	}
}

/*
������ ���� ����� ������ ���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��϶�.
- int Ÿ���� x1, y1, x2, y2 �ʵ� : �簢���� �����ϴ� �� ���� ��ǥ
- ������ 2�� : �Ű� ���� ���� �����ڿ� x1, y1, x2, y2�� ���� �����ϴ� ������
- void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 ��ǥ ����
- int square() : �簢�� ���� ����
- void show() : ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
- boolean equals(Rectangle r) : ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���簢���̸� true ����
Rectangle�� �̿��� main() �޼ҵ�� ������ ������ �� main() �޼ҵ尡 �� �۵��ϵ��� �϶�.
*/