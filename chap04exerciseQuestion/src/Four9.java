
public class Four9 {
	public static void main(String[] args) {
		
		//문자열에 들어있는 숫자들의 합을 구하시오.
		String str ="12345";
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';   //이게 핵심이네. char타입으로 바꿔서 '0'을 빼주는 것.
		}
		System.out.println("sum=" + sum);
	}
}
