import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("c:/temp/test.txt");
			while(true) {
				String line = scanner.nextLine(); // ��ĭ�� �����Ͽ� �� �� �б�
				if(line.length() == 0) // �� �ٿ� <Enter>Ű�� �Է��� ���
					break;
				fout.write(line, 0, line.length()); // ���� ���ڿ��� ���Ͽ� ����
				fout.write("\r\n", 0, 2); // �� �� �ٱ� ���� \r\n�� ���Ͽ� ����
				
			}
			System.out.println("File Saved 'c:\\Temp\\test.txt' ");
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}