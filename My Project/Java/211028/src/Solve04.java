
public class Solve04 {

	public static void main(String[] args) {
		int [][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float avg = 0;
		
		//�ڵ� ���Ժκ�
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
			avg = (float)total / (arr.length * arr[0].length);
				
		//System.out.println("1�����迭��:" + arr.length + " 2�����迭��:" + arr[0].length);
		System.out.println("total="+total);
		System.out.println("avarage="+avg);
		
	} // end of main
}	  // end of class