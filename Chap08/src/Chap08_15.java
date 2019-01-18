import java.io.File;

public class Chap08_15 {
	public static void main(String[] args) {
		//command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
	}
	
	static File createFile(String fileName) {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch(Exception e) {
			//fileName�� �������� ���, ���� �̸��� '�������.txt'�� �Ѵ�.
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName); //FileŬ������ ��ü�� �����.
			createNewFile(f); //������ ��ü�� �̿��� ������ �����Ѵ�.
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile(); //������ �����Ѵ�.
		} catch(Exception e) { }
	}
}
