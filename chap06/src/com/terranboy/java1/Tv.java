package com.terranboy.java1;

public class Tv{
	//Tv�� �Ӽ�(�������)
	String color;  
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}