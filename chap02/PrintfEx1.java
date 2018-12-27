package chap02;

public class PrintfEx1 {

	public static void main(String[] args) {
		
		System.out.printf("1) age=%d, year=%d", 14, 2017);
		System.out.println("");
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		int octNum = 010;     //8진수 10, 10진수로는 8
		int hexNum = 0x10;   //16진수 10, 10진수로 16
		int binNum = 0b10;   // 2진수 10, 10진수로 2
		
		System.out.printf("2) b=%d%n", b);
		System.out.printf("3) s=%d%n", s);
		System.out.printf("4) c=%c, %d%n", c, (int)c);
		System.out.printf("5) finger=[%5d]%n", finger);
		System.out.printf("6) finger=[%-5d]%n", finger);
		System.out.printf("7) finger=[%05d]%n", finger);
		System.out.printf("8) big=%d%n", big);
		System.out.printf("9) hex=%#x%n", hex);
		System.out.printf("10) octNum=%o, %d%n", octNum, octNum);
		System.out.printf("11) hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("12) binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}

}
