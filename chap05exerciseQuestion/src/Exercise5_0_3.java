
public class Exercise5_0_3 {

	public static void main(String[] args) {
		
		//배열 arr에 담긴 모든 값을 더하는 프로그램 완성하기
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//내가 적은 정답~★
		for(int tmp : arr) {
			sum += tmp;
		}
		
		
		System.out.println("sum="+sum);
		
		//출력결과 
		//sum=150
	}
}
