import java.io.File;

public class Chap08_19 {
	public static void main(String[] args) {
		//method1()�� static�޼���� �ν��Ͻ� �������� ���� ȣ�� ����
		Chap08_19.method1();
		System.out.println("method1()�� ��ġ�� main���� ���ƿ�.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return; //���� �������� �޼��带 �����Ѵ�.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally���� ����Ǵ�.");
		}
	}
}

