import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		//정렬하기(거의 다 왔다!)
		int[] numArr = {9,8,7,6,5,4,3,2,1,0};
		int[] numArr1 = {9,8,7,6,5,4,3,2,1,0};
		
		for(int i=0; i<numArr.length-1; i++) {  // 0<=i<9
			System.out.println(Arrays.toString(numArr1) + "기준");
			boolean changed = false; //매 반복마다 changed를 false로 초기화
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {  //옆의 값이 작으면 서로 바꾼다.  내림차순 하려면 이 조건만 바꿔주면되네 ㅋㅋ
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;   //자리바꿈이 발생했으니 changed를 true로 바꾼다.
					System.out.print(Arrays.toString(numArr));
				}
				System.out.println();
			}
			
			if(!changed) break;  //자리바꿈이 없으면 반복문 벗어남.
			
			for(int k=0; k<numArr.length;k++) {
				System.out.print(numArr[k]); //정렬된 결과를 출력
			}
			System.out.println();
			
		}
	}
}
