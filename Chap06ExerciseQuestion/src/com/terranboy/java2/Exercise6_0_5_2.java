package com.terranboy.java2;

public class Exercise6_0_5_2 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;  //������ ���� ����
	float average; //������ ���
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		getTotal();
		getAverage();
	}
	
	int getTotal() {
		return total = kor+eng+math;
	}
	
	float getAverage() {
		return average = (int)(total / 3f * 10 + 0.5f)/10f;
	}
	
	public String info() {
		return name+" , "+ban+" , "+no+" , "+kor+" , "+eng+" , "+math+" , "+total+" , "+average;
	}
	
	
	
}

//������
//ȫ�浿, 1, 1, 100, 60, 76, 236, 78.7