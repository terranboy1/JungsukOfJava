
public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a';  // 'a' 의 아스키코드값은 97이다.
		char c2 = c1;   // 'a'
		char c3 = ' '; 
		
		int i = c1 + 1;  //a에 해당하는 아스키코드값 + 1
		
		c3 = (char)(c1 + 1);  // b
		c2++;
		c2++;
		
		System.out.println("i=" + i);    
		System.out.println("c2=" + c2);   
		System.out.println(("c3=" + c3)); 

	}

}
