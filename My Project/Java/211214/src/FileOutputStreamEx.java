import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");
			fout.write(b);
			fout.close();
		}
		catch(IOException e) {
			System.out.println("C:\\temp\\test.out의 경로명을 확인바람");
			return;
		}
		System.out.println("c:\\temp\\test.out을 저장하였습니다.");
	}

}
