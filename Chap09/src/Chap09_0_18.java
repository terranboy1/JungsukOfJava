
import java.util.StringJoiner;

public class Chap09_0_18 {
	public static void main(String[] args) throws Exception {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		System.out.println(sb);
		
		StringBuffer sb2 = sb.append("456");  //append()는 반환타입이 StringBuffer고 주소를 반환한다. sb의 주소값을 sb2가 가리키게 하는거. 같은 인스턴스를 가리키게 됨.
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("abc");
		sb3.append("123").append("456"); //요렇게 연속호출 가능. 이유는? 주소를 반환하니까~
		System.out.println(sb3);
		
		System.out.println("sb2==sb3의 결과는" + (sb2==sb3));
		System.out.println("sb2.equals(sb3)의 결과는" + sb2.equals(sb3));
		
		//StringBuffer클래스는 equals()는 오버라이딩되어있지 않고 toString()만 오버라이딩되어있어서
		//문자열의 내용을 비교하려면 이렇게 String객체에 담아줘야 한다.
		String aaa = sb2.toString();
		String bbb = sb3.toString();
		System.out.println(aaa.equals(bbb));
		
		System.out.println();
		System.out.println("절취선");
		System.out.println("----------------------------------------");
		
		StringBuffer sb10 = new StringBuffer("abc");
		StringBuffer sb11 = new StringBuffer("abc");
		
		System.out.println("sb10 == sb11 ? " + (sb10==sb11));
		System.out.println("sb10.equals(sb11) ? " + sb10.equals(sb11));
		
		//StringBuffer의 내용을 String으로 변환
		String s = sb10.toString();  // String s = new String(sb); 와 같다.
		String s2 = sb11.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		
		StringBuffer sb12 = new StringBuffer();
		sb12.append(true);
		System.out.println(sb12);
		
	}
}
