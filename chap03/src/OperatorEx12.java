
public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a';  // 'a' �� �ƽ�Ű�ڵ尪�� 97�̴�.
		char c2 = c1;   // 'a'
		char c3 = ' '; 
		
		int i = c1 + 1;  //a�� �ش��ϴ� �ƽ�Ű�ڵ尪 + 1
		
		c3 = (char)(c1 + 1);  // b
		c2++;
		c2++;
		
		System.out.println("i=" + i);    
		System.out.println("c2=" + c2);   
		System.out.println(("c3=" + c3)); 

	}

}
