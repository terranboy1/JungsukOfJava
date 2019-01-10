package com.terranboy.java2;

public class Chap07_0_4 {

	public static void main(String[] args) {
		
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR {
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TVCR extends Tv{  //다중상속이 안되므로 하나는 포함관계를 이용한다.
	VCR vcr = new VCR();       //VCR을 상속을 못받지만 포함관계를 이용해 TVCR클래스에서 VCR객체를 생성해주고 그 멤버를 사용하고 있다.
	                           //이렇게 관계를 맺어주면 나중에 VCR클래스에 변동사항이 있어도 알아서 변동결과를 받을 것이다.
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}