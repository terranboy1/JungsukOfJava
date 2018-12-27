
public class abcdef {

	public static void main(String[] args) {
		
		// char타입은 아스키 값을 직접 적어도 형변환하지 않으면 유니코드로 출력된당께.
		
		//아스키코드 값으로 알파벳 출력.
		char a = 65;  // 'A' 라고 적어도 됨.
		for(int i=0; i<26; i++) {
			System.out.print(a++);
		}
		System.out.println("");
		
//		char a = 'A'     이걸 for문 바깥에 놔두면 값에 계속 영향을 받아버린다.  그래서 값이 계속 올라감.
// 						 내가 원하는 것은 A~Z 3번 반복이라서 변수 선언을 for문 안에 줌.

		
		//유니코드로 넣고 증가시켜도 결과는 똑같다.
		for (int i = 0; i < 3; i++) {
			char aaa = 'a';
			for (int j = 0; j < 26; j++) {
				System.out.print(aaa++);
			}
			System.out.println();
		}
	}
}
