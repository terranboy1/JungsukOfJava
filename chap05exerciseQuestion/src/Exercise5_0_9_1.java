
public class Exercise5_0_9_1 {

	public static void main(String[] args) {
		//주어진 배열을 시계방향으로 90도 회전시켜 출력하는 프로그램 완성
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length;i++) {   //0,1,2,3
			for(int j=0; j<star[i].length;j++) {  //0,1,2,3
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				/*
				 * (1) 알맞은 코드 넣어 완성
				 */
				
				int x = j;
				
				int y = star.length-1-i;
				
				result[x][y] = star[i][j];
			}
		}
		
		for(int i=0; i< result.length; i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
//실행결과
//**
//**
//*****
//*****
//
//****
//****
//**
//**
//**
