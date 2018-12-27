
public class Four13_2 {
	public static void main(String[] args) {  
		//이건 숫자 문자 막 써져있는 것들중 숫자들의 합만 구하는 걸로 변형해본 것.
		String value = "12oo354";
		char ch = ' ';
		int sum = 0;
		boolean isNumber = true;
		
		//반복문과 charAt(int i)를 이용해 문자열의 문자를
		//하나씩 읽어 검사한다.
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if('0'<ch && ch<'9') {   //문자열을 문자로 쪼개 '0'~'9'사이에 속하나 확인.
				sum += ch - '0';
			}
		}
		System.out.println("sum="+sum);
	}
}
