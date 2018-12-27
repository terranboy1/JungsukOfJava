
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;         // long타입의 범위가 900경인데 결과가 잘 나오지않을까?
								//   라고 생각한다면 당신은 함정에 빠진것! 
		System.out.println(c);
		
		
		
		
		
		// int와 int 연산 결과가 long에 저장되기도 전에 int의 값 범위를 초과했다! (이거 간과하기 쉽겟구먼)
		//그럼 이걸 어떻게 해야할까?
		int d = 1_000_000;
		int e = 2_000_000;
		
		long f = (long)d * e;   //한쪽만 형변환해주면 값을 계산할때 자동산술변환된다!
		System.out.println(f);
		
		
		
		
		
		
		
	}

}


