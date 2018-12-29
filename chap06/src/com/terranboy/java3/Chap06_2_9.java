package com.terranboy.java3;

public class Chap06_2_9 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p1의 제품번호는 " + p2.serialNo);
		System.out.println("p1의 제품번호는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두" + Product.count + "개 입니다.");
	}
}

class Product{
	static int count = 0;  //생성된 인스턴스의 수를 저장 . 만약 이걸 인스턴스변수로 해버렸으면 인스턴스 생성될 때마다 0이 되어서 값을 공유할 수가 없지.
	int serialNo;          //인스턴스 고유번호
	
	{
		++count;
		serialNo = count;     // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜 serialNo에 저장한다.
	}
	
	//근데 이부분은 생성자를 쓰는 것과 효용면에서 차이를 느끼긴 어려운데,, 다른 예제를 봐야겠는걸? 이걸론 좀 부족함.
	//이것도 같은거자너 ㅋㅋ 근데 기본생성자 건드는 것보다 어차피 객체 생성시마다 이뤄져야할 작업이라면 초기화블럭으로 하는게 더 효율적인가?
	
//	Product(){
//		++count;
//		serialNo=count;
//	}
}
