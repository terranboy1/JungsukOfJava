
public class Chap08_7 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		try {
			System.out.print(3);
			System.out.print(0/0);
			System.out.print(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			//������ ���ܸ� ó���߱⿡ �� ���� ������� �ʴ´�.
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
