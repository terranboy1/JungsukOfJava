package repeat1;

public class Exercise09_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int pos = fullPath.lastIndexOf("\\");
		
		try {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos+1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("fullPAth: "+fullPath);
		System.out.println("path: "+path);
		System.out.println("fileName: "+fileName);
	}
}

