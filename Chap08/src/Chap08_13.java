
public class Chap08_13 {
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("��������˴ϴ�.");
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ���.");
			e.printStackTrace();
		}
	}
}
