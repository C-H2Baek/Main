import java.util.Scanner;
public class Rectangle {
	public static void main (String args[])  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input of the point(x,y) >>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x >= 100 && x <=200 && y >= 100 && y <= 200) // 점이 사각형 내에 있는 경우
			System.out.println("(" + x + "," + y + ")is in Rectangle.");
		else
			System.out.println("(" + x + "," + y + ")is not in Rectangle.");
		
		scanner.close();
	}
}
