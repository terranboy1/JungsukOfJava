
public class Chap09_0_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8907151560023L);
		Person p2 = new Person(8907151560023L);
		
		if(p1==p2)
			System.out.println("p1과 p2는 같은 사람");
		else
			System.out.println("p1과 p2는 다른 사람");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람");
		else
			System.out.println("p1과 p2는 다른 사람");
	}
}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person)
			//obj가 Object타입이므로 id값을 참조하려면 Person타입으로 형변환 필요.
			return id == ((Person)obj).id;
		else 
			return false; //타입이 Person이 아니면 값을 비교할 필요도 없음.
	}
	
	Person(long id){
		this.id = id;
	}
}