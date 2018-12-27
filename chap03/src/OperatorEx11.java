
public class OperatorEx11 {
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d-a);   //int¹Ì¸¸³¢¸®ÀÇ ¿¬»êÀÌ±â¶«½Ã intÇü µÊ.
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c'= %d%n", a, (int)a);
		System.out.printf("'%c'= %d%n", a, (int)d);
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two, (int)two);
	}
}
