package test;

public class JavaTest { 
	public static void main(String[] args) { 
		C1 class1 = new C1(); 
		C2 class2 = new C2(); 
		C3 class3 = new C3(); 
		
		//class1이 C1의 객체인경우 true
		if(class1 instanceof C1)  
			System.out.println("class1 is C1's object 1");
		
		//class2가 C1의 하위클래스인 C2의 객체인경우 true
		if(class2 instanceof C1)
			System.out.println("class1 is C1's object 2"); 
		
		//class3이 C1의 하위 클래스인 C2의 하위클래스인 C3의 객체인경우 true
		if(class3 instanceof C1)
			System.out.println("class1 is C1's object 3"); 
		
		//class2가 C3의 하위클래스이므로 false
		if(class2 instanceof C3)  
			System.out.println("class1 is C1's object 4"); 
		
		//class2가 C2의 객체이므로 true
		if(class2 instanceof C2)  
			System.out.println("class1 is C1's object 5");
	}
}

class C1 {
	public C1() {
	}
}

class C2 extends C1 {
	public C2() {
	}
}

class C3 extends C2 {
	public C3() {
	}
}