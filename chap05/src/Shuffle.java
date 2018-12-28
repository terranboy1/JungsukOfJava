import java.util.Arrays;

public class Shuffle {

	public static void main(String[] args) {
	
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		
		System.out.print("{");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("}");
		
		
		for(int i=1; i<100; i++) {
			int n = (int)(Math.random()*10);
			
			int tmp = arr[0];  //첫번째 요소를 임시로 tmp 변수에 저장.
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}
}
