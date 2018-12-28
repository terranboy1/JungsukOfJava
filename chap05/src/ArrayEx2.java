import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		//배열의 길이를 변경하는 방법
		//1.더 큰 배열을 새로 생성
		//2.기존 배열의 내용을 새로운 배열에 복사
		//이런 작업은 비용이 많이 들기 때문에 처음부터 배열 길이 넉넉하게 잡아 새로운 배열 생성하는 상황이 적도록 하는게 좋음.
		//그렇다고 너무 크게 잡으면 메모리 공간 낭비되고.. 필요치의 2배정도?
		
		//배열의초기화
		//일정한 규칙이 있는 값이라면 for문이 좋겠지만
		//그게 안될 경우~~~ int[] score = new int[] {50, 60, 70, 80, 90}; 이렇게 생성과 초기화 동시에 가능.
		//이렇게 저장할 값들을 괄호{} 안에 쉼표로 구분해 나열하면 되고, 괄호 안의 값의 개수에 의해 배열 길이가 자동으로 결정되므로 배열 길이 적을 필요 없음.
		
        //그리고  int[] score = {50, 60, 70, 80, 90}; 처럼 한 줄에 적으면 new 타입[]을 생략 가능하지만
		//배열 선언과 생성을 따로하는 경우엔 생략 불가다. 즉, 아래처럼 써야함.
		//int[] score;
		//score = new int[] {50, 60, 70, 80, 90};
		
		//int[] score={}; 이것은 길이가 0인 배열 생성. 참조변수의 기본값은 null이지만 배열을 가리키는 참조변수는 null대신 길이가 0인 배열로 초기화됨.
		
		//int[] score = new int[0];      길이가 0인 배열
		//int[] score = new int[]{};  길이가 0인 배열
		//int[] score = {};           길이가 0인 배열. new int[] 생략가능.
		
		
		//배열을 출력하는 간단한 방법 소개
//		int[] iArr = {100, 95, 80, 70, 60};
//		//배열의 iArr의 모든 요소 출력
//		System.out.println(Arrays.toString(iArr));
//		System.out.println(iArr);      //참고로 이거 출력되는 주소는 실제 주소가 아닌 내부 주소라는데 뭔지 잘 모르겠다.
		
		//예외적으로 char 배열은 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력되는데 이건 println메서드가 char배열일 때만 이렇게 동작되도록 작성되었기 때문! 
//		char[] chArr = {'a', 'b', 'c', 'd'};  
//		System.out.println(chArr);   //abcd 출력됨.
		
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		}
		
		//배열에 저장된 값 출력
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}
