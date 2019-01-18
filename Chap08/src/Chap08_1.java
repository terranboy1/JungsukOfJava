
public class Chap08_1 {

	public static void main(String[] args) {
		try {
			try { } catch(Exception e) { }
		} catch (Exception e) {
			try { } catch (Exception e1) { } //변수 e 중복선언되면 안됨
		}
		
		try {
			
		} catch (Exception e) {
			
		}
	}

}
