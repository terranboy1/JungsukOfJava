package test;

public class test {
	public static void main(String[] args) {
		
		Car c = new FireEngine();
		if(c instanceof FireEngine) {
			System.out.println("����ǳ�");
		}

	}
}
class Car {
	
	void drive() {
		System.out.println("�θ��θ�");
	}
}
class FireEngine extends Car {
//	int x;
//	int y;
	void water() {
		System.out.println("������~!");
	}
}