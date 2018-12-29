package com.terranboy.java3;

public class Chap06_3_0 {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
		//제목없음은 냅두고 자바.txt를 같은 인스턴스를 계속 생성했을 때 자바1.txt 자바2.txt..이렇게 넘버 이어받게 하려면 어떻게 해야하지?
	}
}

class Document {
	static int count =  0;
	String name;         //문서명(Document name)
	
	Document(){   //문서 생성시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 "+ this.name+ "가 생성되었습니다.");
	}
}

// 만약 여기서 이전 예제처럼 인스턴스 초기화블럭을 사용해버리면 요상하게 될 것 같다.