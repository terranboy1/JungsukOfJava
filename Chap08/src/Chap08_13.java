
public class Chap08_13 {
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("정상종료됩니다.");
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었다.");
			e.printStackTrace();
		}
	}
}
