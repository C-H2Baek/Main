import java.util.Scanner;

abstract class Calc{
	int a,b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}
class Add extends Calc{
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		if(b==0) {
			System.out.println("0���� ���� �� �����");
		}
		else {
			System.out.println(a/b);
		}
		return a/b;
	}
}

public class Solve5_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op=sc.next();
		Calc sp;
		switch(op.charAt(0)) {
		case '+':
			sp = new Add();
			break;
		case '-':
			sp = new Sub();
			break;
		case '*':
			sp = new Mul();
			break;
		case '/':
			sp = new Div();
			break;
		default:
			return ;
		}
		sp.setValue(a, b);
		System.out.println(sp.calculate());
		
	}
	
}
