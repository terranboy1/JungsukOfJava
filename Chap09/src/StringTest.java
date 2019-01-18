import java.util.Arrays;
import java.util.StringJoiner;

public class StringTest {

	public static void main(String[] args) {
		String a = "";
		char[] b = {'a', 'b', 'c'};
		String c = new String(b);
		System.out.println(Arrays.toString(b));
		
		StringBuffer d = new StringBuffer("Hello");
		String e = new String(d);
		
		String animals = "dog-cat-bear";
		
		String[] arr = animals.split("-");			
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = {"dog", "cat", "rabbit"};
		String str = String.join("-", arr1);
		System.out.println(str);
		
		StringJoiner sj = new StringJoiner(",", "[[", "]]");
		String[] strArr = { "aaa", "bbb", "ccc" };
		
		for(String s : strArr)
			sj.add(s.toUpperCase());
		
		System.out.println(sj.toString());
		
		String s = String.format("%d + %d = %d", 2, 5, 7);
		System.out.println(s);
		
		int i = 100;
		
		String test1 = i + "" + 5;
		System.out.println(test1);
		
		String test2 = String.valueOf(i);  //기본형-->문자열
		System.out.println(test2 + 5);
		
		int ii = Integer.parseInt(test1);
		System.out.println(ii+5);
		
		String test3 = "12345";
		int iii = Integer.valueOf(test3);  //문자열-->기본형
		System.out.println(iii+50000);
		
		String test4 = "true";
		Boolean aaa = Boolean.valueOf(test4);
		System.out.println(aaa);
		
	}
}
