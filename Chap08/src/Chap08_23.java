public class Chap08_23 {
	public static void main(String[] args) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

static void install() throws InstallException {
	try {
		startInstall(); //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
		copyFiles();    //���ϵ��� �����Ѵ�.
	} catch(SpaceException e) {
		InstallException ie = new InstallException("��ġ�� ���� �߻�");
		ie.initCause(e);
		throw ie;
	} catch(MemoryException me) {
		InstallException ie = new InstallException("��ġ�� ���� �߻�");
		ie.initCause(me);
		throw ie;
	} finally {
		deleteTempFiles();
	}
}

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ ������ �����ϴ�!");
		}
	
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����ϴ�!");
		 // throw new RumtimeException(new MemoryException("�޸𸮰� �����ϴ�!");
		}
	}

	static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ� �ۼ�*/ }
	static void deleteTempFiles() { /* �ӽ����� �����ϴ� �ڵ� �ۼ� */ }
	
	static boolean enoughSpace() {
		//��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ� �ۼ�
		return false; //��� �����غ��ô�~
	}
	
	static boolean enoughMemory() {
		//��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ� �ۼ�
		return true; //��� �����غ��ô�~
	}
}

class InstallException extends Exception {
	InstallException(String msg){
		super(msg);
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