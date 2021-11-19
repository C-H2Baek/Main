class ArrayUtility{
	static double[] intToDouble(int [] source) {//int �迭�� double �迭�� ��ȯ
		double arrayTmp[] = new double[source.length]; 
		for(int i=0; i<source.length;i++) {
			arrayTmp[i]=(double)source[i];
		}
		return arrayTmp;
	}
	static int [] doubleTolnt(double [] source) {//double �迭�� int �迭�� ��ȯ
		int arrayTmp[] = new int[source.length];
		for (int i=0; i<source.length; i++) {
			arrayTmp[i]=(int)source[i];
		}
		return arrayTmp;
	}
}
public class SolveArray{
	
	public static void main(String[] args) {
		int arrayInt[]= {1 , 2 , 3 , 4 , 5};
		double arrayDouble[]= {1.2 , 2.3 , 3.4 , 4.5 , 5.6};
		ArrayUtility a1 = new ArrayUtility();
		double alterDouble[] = ArrayUtility.intToDouble(arrayInt);
		int alterInt[] = ArrayUtility.doubleTolnt(arrayDouble);
		System.out.print("�ٲ�� ��(int):");
		for(int num: arrayInt) {
			System.out.print(num+"");
		}
		System.out.println();
		System.out.print("�ٲ� ��(int):");
		for(int num: alterInt) {   
			System.out.print(num+"");
		}
		System.out.println();
		System.out.println();
		System.out.print("�ٲ�� ��(double): ");
		for(double num: arrayDouble) {
			System.out.print(num+"");
		}
		System.out.println();
		System.out.print("�ٲ� ��(double):");    
		for(double num: alterDouble) {
			System.out.print(num+"");
		}
	}
	
}

//���� �� ���� static �޼ҵ带 ���� ArrayUtility Ŭ������ ������.
//ArrayUtility Ŭ������ �̿��ϴ� �׽�Ʈ�� ���α׷��� �Բ� �ۼ��϶�.
//static double [] intToDouble(int [] source); // int �迭�� double �迭�� ��ȯ
//static int [] doubleToInt(double [] source); // double �迭�� int �迭�� ��ȯ