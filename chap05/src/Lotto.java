import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[45];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=1; i<200; i++) {		
			int n = (int)(Math.random()*45);  //숫자가 아니라 인덱스야~!
			
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		//뭐야, 로또번호 구하려면 셔플한다음에 앞에 6개만 출력하면 되네;;
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n",i,arr[i]);
		}
		
		
	}

}
