
public class OperatorEx1 {
	public static void main(String[] args) {
		int i=5;
		i++;
		System.out.println(i);
		
		i=5;
		++i;
		System.out.println(i);
		
		// 증감연산자가 '수식이나 메서드 호출'에 포함되지 않고 단독적으로 쓰이면 전위형 후위형 차이 없음.
		//차이는 수식이나 메서드 호출에서 발생하니 저 경우를 주의해야겠군.
	}
}
