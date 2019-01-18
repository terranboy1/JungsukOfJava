
public class Chap08_6 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		try {
			System.out.print(3);
			System.out.print(0/0);
			System.out.print(4);  //실행되지 않는다.
		} catch(Exception e) {
			System.out.print(5);
		}
		System.out.print(6);
	}
}
