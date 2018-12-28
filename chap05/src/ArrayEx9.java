import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		//불연속적인 범위의 값들로 배열을 채우는 방법(배열을 하나 더 사용.)
		//먼저 배열 code에 불연속적인 값들을 담고
		//임의로 선택된 index에 저장된 값으로 배열 arr의 요소들을 하나씩 채우면 되는 것.
		//저장된 값에 상관없이 배열의 index는 항상 연속적이기 때문.
		
		int[] code = {-4, -1, 3, 6, 11};  //불연속적 값으로 배열 구성
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()* code.length);  //인덱스를 랜덤으로 생성하네.
			arr[i] = code[tmp];   //랜덤으로 생성한 인덱스를 arr의 인덱스로 줌.
		}
		System.out.println(Arrays.toString(arr));
	}

}
