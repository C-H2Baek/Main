class ArrayUtiliy2{
	//s1과 s2를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		
		int arrayTmp[] = new int[s1.length+s2.length];
		for(int i=0; i<arrayTmp.length; i++) {
			if(i<s1.length) {
				arrayTmp[i] = s1[i];
			} else {
				arrayTmp[i] = s2[i-s1.length];
			}
		}
	
	return arrayTmp;
}
	//s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	static int[] remove(int[] s1, int[] s2) {
		int a = s1.length;
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i]==s2[j]) {
					for(int k = i; k<s1.length-1; k++) {
						s1[k]=s1[k+1];
					}
					a--;
				}
			}
		}
		int arrayTemp[] = new int[a];
		for(int i=0; i<a; i++) {
			arrayTemp[i]=s1[i];
		}
		return arrayTemp;
	}
}
public class Solve04 {
	
}







//다음 두 개의 static 가진 ArrayUtility2 클래스를 만들어보자. 
//ArrayUtility2 클래스를 이용하는 테스트용 프로그램도 함께 작성하라.
//static int [] concat(int [] s1, int [] s2); // s1과 s2를 연결한 새로운 배열 리턴
//static int [] remove(int [] s1, int [] s2); // s1에서 s2 배열의 숫자를 모두 삭제한 새로운 배열 리턴