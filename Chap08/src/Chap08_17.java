import java.io.File;

public class Chap08_17 {
	public static void main(String[] args) {
		try {
			startInstall();  //���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles();     //���� ����
			deleteTempFiles(); //��ġ�� ���� �ӽ����� ����
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles(); //��ġ�� ���� �ӽ����� ����
		}
	}
	
	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ� */
	}
	static void copyFiles() { /* ������ �����ϴ� �ڵ� */ }
	static void deleteTempFiles() { /* �ӽ����ϵ� �����ϴ� �ڵ� */ }
}
