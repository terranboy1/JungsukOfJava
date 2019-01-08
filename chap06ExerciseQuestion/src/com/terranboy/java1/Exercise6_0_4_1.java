package com.terranboy.java1;

public class Exercise6_0_4_1 {
	public static void main(String[] args) {
		//문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
		//getTotal()과 getAverage()를 추가하시오.
		//
		//1.메서드명 : getTotal
		//           기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해 반환
		//     반환타입: int
		//     매개변수: 없음
		//
		//2.메서드명 : getAverage
		//           기능 : 총점(국점+영점+수점)을 과목수로 나눈 평균 구함
		//           소수점 둘째자리에서 반올림할 것
		//    반환타입 : float
		//    매개변수 : 없음
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
	}
}

//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//}


//실행결과
//-----------
//이름:홍길동
//총점:236
//평균:78.7