
public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';                         //잘보니 알파벳 출력 프로그램이네 ㅋㅋㅋ
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();	
	}
}
