
public class Chap08_5 {

	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		try {
			System.out.print(3);
			System.out.print(0/0);
			System.out.print(4);
		} catch (Exception e) {
			System.out.print(5); //실행되지 않는다.
		}
		System.out.print(6);
	}
}
