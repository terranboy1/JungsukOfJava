import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Chap09_0_31 {
	public static void main(String args[]) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "co2", "cassadsad","fat"};
		
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자영단어
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i]+",");
		}
	}
}
