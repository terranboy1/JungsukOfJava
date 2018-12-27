
public class Four13_1 {
	public static void main(String[] args) {
		
		//아무렇게나 적힌 문자열이 오로지 숫자인지 판독하는 숫자판독기
		String value = "120oo34";
		char ch = ' ';
		boolean isNumber = true;
		
		//반복문과 charAt(int i)를 이용해 문자열의 문자를
		//하나씩 읽어 검사한다.
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if(!('0'<=ch && ch<'9')) {   //문자열을 문자로 쪼개 '0'~'9'사이에 속하나 확인.
				isNumber = false;
//				break;                   //이건 정답에 없는데 문자가 아닌 것이 1개라도 나오면 거기서 중단해야 효율이 늘어날 거 같다.
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
}
