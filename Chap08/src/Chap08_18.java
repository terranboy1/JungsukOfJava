import java.io.File;

public class Chap08_18 {
	public static void main(String[] args) {
		try {
			startInstall();  //���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles();     //���� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles(); //��ġ�� ���� �ӽ����� ����
		}
	}
	
	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ� */
	}
	static void copyFiles() { /* ������ �����ϴ� �ڵ� */ }
	static void deleteTempFiles() { /* �ӽ����ϵ� �����ϴ� �ڵ� */ }
}
