import java.util.Scanner;

public class CompareDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("2자리수 를 입력하세요(10~99)>>");
	        
	        int a=sc.nextInt();
	        
	        int b,c;
	        
	        b = a%10; //일의자리
	        c = a/10; //십의자리
	        
	        System.out.println("십의자리 " + c + "일의자리 " + b);
	        if (b==c) {
	        	System.out.println("예 같단다");
	        }
	        else {
	        	System.out.println("다르단다");
	        }
	        
	    }
		sc.close(); 	
	}
	
}
