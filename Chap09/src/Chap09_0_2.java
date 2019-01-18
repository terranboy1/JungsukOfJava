
public class Chap09_0_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8907151560023L);
		Person p2 = new Person(8907151560023L);
		
		if(p1==p2)
			System.out.println("p1�� p2�� ���� ���");
		else
			System.out.println("p1�� p2�� �ٸ� ���");
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ���");
		else
			System.out.println("p1�� p2�� �ٸ� ���");
	}
}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person)
			//obj�� ObjectŸ���̹Ƿ� id���� �����Ϸ��� PersonŸ������ ����ȯ �ʿ�.
			return id == ((Person)obj).id;
		else 
			return false; //Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ䵵 ����.
	}
	
	Person(long id){
		this.id = id;
	}
}