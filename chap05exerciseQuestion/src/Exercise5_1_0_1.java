
public class Exercise5_1_0_1 {
	public static void main(String[] args) {
		//다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		//(1)에 알맞은 코드를 넣어 완성하시오.
		//(5-10번 연습문제 암호표 참조.)
		
		//알파벳 암호화(a~z)
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		//숫자 암호화(0~9)
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
		String src = "abc123";
		String result ="";
			
		//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i<src.length(); i++) {  //length:6
			char ch = src.charAt(i);
			/*
			 * (1)알맞은 코드 넣어 완성하기
			 */

		}
			
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}
//실행결과
//src:abc123
//result:`~!wer