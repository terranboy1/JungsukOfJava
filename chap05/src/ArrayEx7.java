
public class ArrayEx7 {

	public static void main(String[] args) {
		
		//배열 shuffle하기.
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;  //배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<20; i++) {
			int n = (int)(Math.random()*10);   // 0~9의 난수 중 하나를 변수 n에 담음.  index끼린 중복이 막 생겨도 실제 값들에 중복은 안생기네. 이게 포인트였네. 맨날 헷깔렸어.
			int tmp = numArr[0];               // numArr[0]의 값을 변수 tmp에 담음.
			numArr[0] = numArr[n];             // numArr[n] 값을 numArr[0]에 저장.
			numArr[n] = tmp;                   // numArr[n]에 tmp값을 저장.
		}
		
//		for(int i=0; i<numArr.length; i++) {
//			int n = (int)(Math.random()*10);   // 0~9의 난수 중 하나를 변수 n에 담음.  index끼린 중복이 막 생겨도 실제 값들에 중복은 안생기네. 이게 포인트였네. 맨날 헷깔렸어.
//			int tmp = numArr[i];               // numArr[0]의 값을 변수 tmp에 담음.
//			numArr[i] = numArr[n];             // numArr[n] 값을 numArr[0]에 저장.
//			numArr[n] = tmp;                   // numArr[n]에 tmp값을 저장.
//		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
