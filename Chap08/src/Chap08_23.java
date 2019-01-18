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
		startInstall(); //프로그램 설치에 필요한 준비를 한다.
		copyFiles();    //파일들을 복사한다.
	} catch(SpaceException e) {
		InstallException ie = new InstallException("설치중 예외 발생");
		ie.initCause(e);
		throw ie;
	} catch(MemoryException me) {
		InstallException ie = new InstallException("설치중 예외 발생");
		ie.initCause(me);
		throw ie;
	} finally {
		deleteTempFiles();
	}
}

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치 공간이 부족하다!");
		}
	
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족하다!");
		 // throw new RumtimeException(new MemoryException("메모리가 부족하다!");
		}
	}

	static void copyFiles() { /* 파일들을 복사하는 코드 작성*/ }
	static void deleteTempFiles() { /* 임시파일 삭제하는 코드 작성 */ }
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드 작성
		return false; //요걸 조작해봅시다~
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리공간이 있는지 확인하는 코드 작성
		return true; //요걸 조작해봅시다~
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