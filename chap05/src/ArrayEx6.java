
public class ArrayEx6 {

	public static void main(String[] args) {
		
		//최대값과 최소값
		int[] score = {79, 88, 91, 33, 100, 55, 95, 1, 100, 27, 199};
		
		int max = score[0];  //배열의 첫번째 값을 최대값으로 초기화
		int min = score[0];  //배열의 첫번째 값을 최소값으로 초기화
		
		for(int i=1; i<score.length; i++) {     //배열의 두번째 요소부터 읽기 위해 변수i값을 1로 초기화.
			if(max<score[i]) {
				max = score[i];
			} else if(min>score[i]) {
				min = score[i];
			}		
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}

}
