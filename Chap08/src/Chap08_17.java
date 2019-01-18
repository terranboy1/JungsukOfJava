import java.io.File;

public class Chap08_17 {
	public static void main(String[] args) {
		try {
			startInstall();  //프로그램 설치에 필요한 준비
			copyFiles();     //파일 복사
			deleteTempFiles(); //설치에 사용된 임시파일 삭제
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles(); //설치에 사용된 임시파일 삭제
		}
	}
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드 */
	}
	static void copyFiles() { /* 파일을 복사하는 코드 */ }
	static void deleteTempFiles() { /* 임시파일들 삭제하는 코드 */ }
}
