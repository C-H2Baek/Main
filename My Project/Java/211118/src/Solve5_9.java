
import java.util.Scanner;

interface Stack {
	int length(); 
	int capacity(); 
	String pop(); 
	boolean push(String val); 
}
class StringStack implements Stack {
	private String stk[];
	private int tos;
	public StringStack(int cap) {
		stk = new String[cap];
		tos = -1;
	}
	@Override
	public int length() {
		return tos+1;
	}
	@Override
	public int capacity() {
		return stk.length;
	}
	@Override
	public String pop() {
		if(tos==-1) {
			return null;
		}
		String s = stk[tos];
		tos--;
		return s;
	}
	@Override
	public boolean push(String str) {
		if(tos == stk.length-1)
			return false;
		else {
			tos++;
			stk[tos] = str;
			return true;
		}
	}
}
public class Solve5_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장공간의 크기입력 >> ");
		int n = sc.nextInt();
		
		StringStack ss = new StringStack(n);
		
		while(true) {
			System.out.print("문자열 입력>>");
			String st = sc.next();
			if(st.contentEquals("그만"))
				break;
			boolean result = ss.push(st);
			if(!result) {
				System.out.println("스택이 꽉 차서 푸시불가 '그만' ");
			}
		}
		System.out.println("스택에 저장된 모든 문자열>>");
		int len = ss.length();
		for (int i=0; i<(len); i++) {
			System.out.print(ss.pop()+" ");
		}
		sc.close();
	}
}
