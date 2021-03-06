class ArrayUtility{
	static double[] intToDouble(int [] source) {//int 배열을 double 배열로 변환
		double arrayTmp[] = new double[source.length]; 
		for(int i=0; i<source.length;i++) {
			arrayTmp[i]=(double)source[i];
		}
		return arrayTmp;
	}
	static int [] doubleTolnt(double [] source) {//double 배열을 int 배열로 변환
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
		System.out.print("바뀌기 전(int):");
		for(int num: arrayInt) {
			System.out.print(num+"");
		}
		System.out.println();
		System.out.print("바뀐 후(int):");
		for(int num: alterInt) {   
			System.out.print(num+"");
		}
		System.out.println();
		System.out.println();
		System.out.print("바뀌기 전(double): ");
		for(double num: arrayDouble) {
			System.out.print(num+"");
		}
		System.out.println();
		System.out.print("바뀐 후(double):");    
		for(double num: alterDouble) {
			System.out.print(num+"");
		}
	}
	
}

//다음 두 개의 static 메소드를 가진 ArrayUtility 클래스를 만들어보자.
//ArrayUtility 클래스를 이용하는 테스트용 프로그램도 함께 작성하라.
//static double [] intToDouble(int [] source); // int 배열을 double 배열로 변환
//static int [] doubleToInt(double [] source); // double 배열을 int 배열로 변환