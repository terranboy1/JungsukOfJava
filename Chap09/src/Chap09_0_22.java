import java.util.Comparator;
import static java.util.Objects.*;

class Chap09_0_22 {
	public static void main(String args[]) {
		Comparator c = String.CASE_INSENSITIVE_ORDER;
		
		System.out.println(compare("aa","bb",c));
	}
}
