
public class Exercise5_0_9_2 {

	public static void main(String[] args) {
		//�־��� �迭�� �ð�������� 90�� ȸ������ ����ϴ� ���α׷� �ϼ�
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
				 * (1) �˸��� �ڵ� �־� �ϼ�
				 */
				int x = j;
				int y = star.length-1-i;
				
				result[x][y]=star[i][j];
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
//������
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
