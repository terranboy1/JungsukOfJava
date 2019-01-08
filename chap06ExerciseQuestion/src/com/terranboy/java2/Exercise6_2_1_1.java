package com.terranboy.java2;

public class Exercise6_2_1_1 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
	}
}

//실행결과
//------------------
//CH:100, VOL:0
//CH:99, VOL:0
//CH:100, VOL:100

//TV클래스를 주어진 로직대로 완성하라.
//완성 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
//(코드를 단순히 하기 위해 유효성 검사는 제외했다.)

//class MyTv {
//	boolean isPowerOn;
//	int channel;
//	int volume;
//
//	final int MAX_VOLUME = 100;
//	final int MIN_VOLUME = 0;
//	final int MAX_CHANNEL = 100;
//	final int MIN_CHANNEL = 0;
//	
//	void turnOnOff() {
//		//isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
//	}
//	
//	void volumeUp() {
//		// volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
//	}
//	
//	void volumeDown() {
//		// volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
//	}
//	
//	void channelUp() {
//		// channel의 값을 1 증가시킨다.
//		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
//	}
//	
//	void channelDown() {
//		// channel의 값을 1 감소시킨다.
//		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
//	}
//}