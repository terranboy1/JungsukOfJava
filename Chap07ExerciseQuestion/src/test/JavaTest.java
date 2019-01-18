package test;

public class JavaTest { 
	public static void main(String[] args) { 
		C1 class1 = new C1(); 
		C2 class2 = new C2(); 
		C3 class3 = new C3(); 
		
		//class1�� C1�� ��ü�ΰ�� true
		if(class1 instanceof C1)  
			System.out.println("class1 is C1's object 1");
		
		//class2�� C1�� ����Ŭ������ C2�� ��ü�ΰ�� true
		if(class2 instanceof C1)
			System.out.println("class1 is C1's object 2"); 
		
		//class3�� C1�� ���� Ŭ������ C2�� ����Ŭ������ C3�� ��ü�ΰ�� true
		if(class3 instanceof C1)
			System.out.println("class1 is C1's object 3"); 
		
		//class2�� C3�� ����Ŭ�����̹Ƿ� false
		if(class2 instanceof C3)  
			System.out.println("class1 is C1's object 4"); 
		
		//class2�� C2�� ��ü�̹Ƿ� true
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