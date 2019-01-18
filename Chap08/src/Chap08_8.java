
public class Chap08_8 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		try {
			System.out.print(3);
			System.out.print(0/0);
			System.out.print(4);
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);
	}
}
