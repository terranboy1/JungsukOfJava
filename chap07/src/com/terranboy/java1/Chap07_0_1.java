package com.terranboy.java1;

public class Chap07_0_1 {

	public static void main(String[] args) {
		//���
		//����Ŭ������ ������ ���ο� Ŭ������ �ۼ��ϴ� ��.
		//�����ϱ� ������ �ڵ� ���� �������� �ڵ� �߰��� ������ �����ϴ�.
		//�ߺ��� ������ ���꼺�� ���������� �⿩��.
		//������ ����.
		//class Child extends Parent {}
		//�����ڿ� �ʱ�ȭ���� ��ӵ��� �ʴ´�. ����� ��ӵȴ�.
		//�ڼ�Ŭ������ ��� ������ ���� Ŭ�������� �׻� ���ų� ����.
		
		//�׷� ���������ڰ� private�� default�� ������� ����ϸ� ��Եɱ�?
		//����� ������ �ڼ� Ŭ�����κ����� ������ ���ѵȴٰ� �Ѵ�.
		//�θ� �ִ� private ����� �����Ϸ��� �θ��� ��� �Լ��� ���ؼ� �����ؾ� �Ѵ�.
		
		//�ڼ� Ŭ������ �ν��Ͻ��� �����ϸ� ���� Ŭ������ ����� �ڼ� Ŭ������ ����� ������ �ϳ��� �ν��Ͻ��� �����ȴ�.(�����غ��� ����̴� �翬�� ��)
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");  // caption�� ���� false��? ������ true�϶��� println�� �ߵ��ǰ� �س���.
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
	boolean caption;  //ĸ�ǻ��� on/off
	
	void displayCaption(String text) {
		if(caption) {  // ĸ�� ���°� on(true)�϶��� text�� ������.
			System.out.println(text);
		}
	}
}
