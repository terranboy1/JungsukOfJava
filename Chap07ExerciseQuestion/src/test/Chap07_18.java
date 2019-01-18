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
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}