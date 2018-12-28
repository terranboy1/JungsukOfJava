
public class ArrayEx5 {
	public static void main(String[] args) {
		//배열의 활용 요약. 배열의 활용이 무궁무진 하지만 아래 예제들이 그 시작이다. 잘 배워두도록!		
		//총합과 평균
		//최대값과 최소값
		//섞기(shuffle)
		//임의의 값으로 배열 채우기
		//정렬하기(sort)
		//빈도수 구하기
		
		
		//총합과 평균
		int sum = 0; //총점
		float average = 0f; //평균
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;   //배열의 길이로 나눠주는군. 그리고 결과를 float로 얻기 위해 형변환 해줬고.
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		//아래껀 향상된 for문으로
//		for(int tmp : score) {
//			sum += tmp;
//		}
//		average = sum / (float)score.length;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + average);
		
		
		
		//정리해보면
		//1.배열의 합을 구하고
		//2.배열의 길이로 나눠주면 됨.
		
	}
}
