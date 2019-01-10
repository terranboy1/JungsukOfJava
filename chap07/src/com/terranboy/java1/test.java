package com.terranboy.java1;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Child kid = new Child();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("청불영화입니다. 몇 살 이세요?");
		
		String input = scanner.nextLine();
		kid.age = Integer.parseInt(input);
		
		kid.Play(kid.age);
		
	}

}

class Parent{
	int age;
}

class Child extends Parent {
	void Play(int x) {
		switch(x/10) {
		
		case 1:
			System.out.println("입장 불가");
			break;
		
		case 2:
			System.out.println("입장 가능");
			break;
			
		case 3:
			System.out.println("입장 가능");
			break;
			
		case 4:
			System.out.println("입장 가능");
			break;
		}
		
	}
}