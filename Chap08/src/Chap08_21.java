public class Chap08_21 {
	public static void main(String[] args) {
		try {
			startInstall();  //���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles();  //���� ����
		} catch (SpaceException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ���ּ���.");
		} catch (MemoryException me){
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc(); //������ �÷����� ������ �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		} finally {
			deleteTempFiles();  //���α׷� ��ġ�� ���� �ӽ����� ����
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())  //����� ��ġ ������ ������
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
			
		if(!enoughMemory()) //����� �޸𸮰� ������
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() { /*���� �����ϴ� �ڵ� */ }
	static void deleteTempFiles() { /* �ӽ����� �����ϴ� �ڵ� */ }
	
	static boolean enoughSpace() {
		//��ġ�ϴ� �� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ�
		return true;
	}
	
	static boolean enoughMemory() {
		//��ġ�ϴ� �� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ�
		return false;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}