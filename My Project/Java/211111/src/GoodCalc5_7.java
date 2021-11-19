abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc5_7 extends Calculator {
	@Override
	public int add(int a, int b) { // �߻� �޼ҵ� ����
		return a + b;
	}
	@Override
	public int subtract(int a, int b) { // �߻� �޼ҵ� ����
		return a - b;
	}
	@Override
	public double average(int[] a) { // �߻� �޼ҵ� ����
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
	public static void main(String [] args) {
		GoodCalc5_7 c = new GoodCalc5_7();
		System.out.println(c.add(2, 7));
		System.out.println(c.subtract(2,6));
		System.out.println(c.average(new int [] {5,3,4}));
	}
}
	