
public class Chap08_1 {

	public static void main(String[] args) {
		try {
			try { } catch(Exception e) { }
		} catch (Exception e) {
			try { } catch (Exception e1) { } //���� e �ߺ�����Ǹ� �ȵ�
		}
		
		try {
			
		} catch (Exception e) {
			
		}
	}

}
