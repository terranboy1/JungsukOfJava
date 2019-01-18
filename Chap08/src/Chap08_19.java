import java.io.File;

public class Chap08_19 {
	public static void main(String[] args) {
		//method1()은 static메서드라 인스턴스 생성없이 직접 호출 가능
		Chap08_19.method1();
		System.out.println("method1()을 마치고 main으로 돌아옴.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return; //현재 실행중인 메서드를 종료한다.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블럭이 실행되다.");
		}
	}
}

