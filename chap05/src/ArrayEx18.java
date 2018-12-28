
public class ArrayEx18 {

	public static void main(String[] args) {
		//다차원배열
		//----------------------
		//2차원 배열의 선언과 인덱스
		//선언방법1 타입[][] 변수이름;   ex) int[][] score; 
		//선언방법2 타입 변수이름[][];   ex) int score[][]; 
		//선언방법3 타입[] 변수이름[];   ex) int[] score[];
		
		//2차원배열은 주로 테이블 형태의 데이터를 담는 데 사용됨.
		
		//2차원배열 쫌 빡세네 ㅋㅋ
		int[][] score = {
				{ 100, 100, 100}
			,   {  20,  20,  20}
			,   {  30,  30,  30}
			,   {  40,  40,  40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {    //score.length값은 4
			for(int j=0; j<score[i].length; j++) {  //score[i].length의 값은 3. 잘모르겠으면 자바의정석 216p
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) {    //score의 각 요소(1차원 배열 주소)를 tmp에 저장. score 하나하나가 배열들이니까 배열에 담아야지.
			for(int i:tmp) {        //tmp는 1차원배열을 가리키는 참조변수.
				sum +=i;
				System.out.println(sum);
			}
		}
		
		System.out.println("sum="+sum);
	}
}
