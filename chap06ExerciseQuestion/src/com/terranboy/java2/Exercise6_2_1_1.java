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

//������
//------------------
//CH:100, VOL:0
//CH:99, VOL:0
//CH:100, VOL:100

//TVŬ������ �־��� ������� �ϼ��϶�.
//�ϼ� �Ŀ� �����ؼ� �־��� �������� ��ġ�ϴ��� Ȯ���϶�.
//(�ڵ带 �ܼ��� �ϱ� ���� ��ȿ�� �˻�� �����ߴ�.)

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
//		//isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
//	}
//	
//	void volumeUp() {
//		// volume�� ���� MAX_VOLUME���� ���� ���� ���� 1 ������Ų��.
//	}
//	
//	void volumeDown() {
//		// volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1 ���ҽ�Ų��.
//	}
//	
//	void channelUp() {
//		// channel�� ���� 1 ������Ų��.
//		// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
//	}
//	
//	void channelDown() {
//		// channel�� ���� 1 ���ҽ�Ų��.
//		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
//	}
//}