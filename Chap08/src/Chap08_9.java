
public class Chap08_9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e; //예외를 발생시킨다.			
		//위 두줄을 다음과 같이 한 줄로 적을 수 있다.
		// throw new Exception("고의로 발생시켰음.");
		} catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}
