
public class EqualsTest {

	public static void main(String[] args) {
		Person1 p1 = new Person1(8807111560022L);
		Person1 p2 = new Person1(8807111560022L);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}
}

class Person1 {
	long id;
	
	Person1(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person1) {
			return id == ((Person1)obj).id;
		} else {
			return false;
		}

	}
}

