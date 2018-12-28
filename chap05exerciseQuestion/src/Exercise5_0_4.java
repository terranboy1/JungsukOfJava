
public class Exercise5_0_4 {

	public static void main(String[] args) {
		

		
		//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램
		int[][] arr = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		
		//이거슨 해답 풀이. 변수는 줄일수록 좋지.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = total / (float)(arr.length * arr[0].length);
		
		
		//이거슨 내가 생각한 풀이
//		int count = 0; //평균을 구하기 위해서 배열을 읽어온 횟수를 저장할 변수.
//		for(int[] tmp : arr) {
//			for(int tmp1 : tmp) {
//				total += tmp1;
//				count++;
//			}
//		}
//		average = total / (float)count;
		//-------------------------------------------------------------------
		
		
		
		
		
			
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		//실행결과
		//total=325
		//average=16.25
		
		
		//와우..응용 오졌다. 이걸 내가 풀었서!
	}
}
