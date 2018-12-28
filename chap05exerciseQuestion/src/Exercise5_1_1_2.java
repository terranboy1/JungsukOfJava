
public class Exercise5_1_1_2 {

	public static void main(String[] args) {
		//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
		//배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고
		//출력하는 프로그램이다.
		//(1)에 알맞은 코드를 넣어 완성하시오.
		
		int[][] score = {
				{100, 100, 100}
			,   {20, 20, 20}
			,   {30, 30, 30}
			,   {40, 40, 40}
			,   {50, 50, 50}
		};
		
		//현재 배열보다 행과 열이 1씩 더 큰 2차원 배열 생성.
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) {        //score.length = 5
			for(int j=0; j<score[i].length;j++) {  //score[i].length = 3
				/*
				 *  (1) 알맞은 코드를 넣어 완성하시오.
				 */			
				result[i][j] = score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
//실행결과
//100 100 100 100
//20  20  20  60
//30  30  30  90
//40  40  40 120
//50  50  50 150
//240 240 240 720
