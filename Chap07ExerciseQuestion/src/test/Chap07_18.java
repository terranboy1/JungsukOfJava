package test;

public class Chap07_18 {
	public static void main(String[] args) {
//		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
//		
		Robot r = new Robot();
		
		if(r instanceof DanceRobot) {
			System.out.println("true");
		}
	}
}

class Robot { }

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}