package com.terranboy.java1;

public class Chap07_0_1 {

	public static void main(String[] args) {
		//상속
		//기존클래스를 재사용해 새로운 클래스를 작성하는 것.
		//재사용하기 때문에 코드 양이 적어지고 코드 추가와 변경이 용이하다.
		//중복이 적어져 생산성과 유지보수에 기여함.
		//사용법은 간단.
		//class Child extends Parent {}
		//생성자와 초기화블럭은 상속되지 않는다. 멤버만 상속된다.
		//자손클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
		
		//그럼 접근제어자가 private나 default인 멤버들을 상속하면 어떻게될까?
		//상속은 되지만 자손 클래스로부터의 접근이 제한된다고 한다.
		//부모에 있는 private 멤버에 접근하려면 부모의 멤버 함수를 통해서 접근해야 한다.
		
		//자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.(생각해보니 상속이니 당연한 말)
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");  // caption이 지금 false지? 조건을 true일때만 println이 발동되게 해놨어.
		ctv.caption = true;  
		ctv.displayCaption("Hello, World");
	} 
}

class Tv{
	boolean power; 
	int channel;
	
	void power() {power =!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;  //캡션상태 on/off
	
	void displayCaption(String text) {
		if(caption) {  // 캡션 상태가 on(true)일때만 text를 보여줌.
			System.out.println(text);
		}
	}
}
