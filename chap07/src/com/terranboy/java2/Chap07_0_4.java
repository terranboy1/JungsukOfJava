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

class TVCR extends Tv{  //���߻���� �ȵǹǷ� �ϳ��� ���԰��踦 �̿��Ѵ�.
	VCR vcr = new VCR();       //VCR�� ����� �������� ���԰��踦 �̿��� TVCRŬ�������� VCR��ü�� �������ְ� �� ����� ����ϰ� �ִ�.
	                           //�̷��� ���踦 �ξ��ָ� ���߿� VCRŬ������ ���������� �־ �˾Ƽ� ��������� ���� ���̴�.
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