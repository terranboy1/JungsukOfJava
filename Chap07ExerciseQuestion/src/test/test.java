package test;

public class test {
	public static void main(String[] args) {
		
		Car c = new FireEngine();
		if(c instanceof FireEngine) {
			System.out.println("실행되네");
		}

	}
}
class Car {
	
	void drive() {
		System.out.println("부릉부릉");
	}
}
class FireEngine extends Car {
//	int x;
//	int y;
	void water() {
		System.out.println("물대포~!");
	}
}