package repeat1;

public class Exercise09_6 {
	public static String fillZero(String src, int length) {

		if (src == null || src.length() == length) {
			return src;
		} else if (length <= 0) {
			return "";
		} else if (length<src.length()) {
			return src.substring(0, length);
		}
		
		char[] chArr = new char[length];
		
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = '0';
		}
		
		System.arraycopy(src.toCharArray(), 0, chArr, length-src.length(), src.length());
		
		return new String(chArr);
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}
//0000012345
//
//123