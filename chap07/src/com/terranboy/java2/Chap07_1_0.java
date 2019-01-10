package com.terranboy.java2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chap07_1_0 {
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat time = new SimpleDateFormat("kk시mm분ss초 ");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
		
		String abc = new String("바보"); // String클래스는 import한 적이 없는데 어찌 패키지명을 생략해도 될까~? java.lang패키지는 빈번히 사용되는 중요 클래스들이 있는 패키지라 컴파일러가 추가해서!!(편리!)
		
		
		
		
		/*
			소스코드 작성할 때 다른 클래스 쓰려면 매번 패키지명 포함 클래스 풀네임을 적어줘야 한다.
			여간 불편한 일이 아닐 수 없다.
			그래서 클래스의 코드를 작성하기 전 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면
			소스코드에 사용되는 클래스이름에서 패키지명을 생략할 수 있다. 
			즉, import문의 역할은 소스파일에 사용ㄷ왼 클래스의 패키지에 대한 정보를 컴파일러에게 제공하는 것.
			컴파일러 시 컴파일러는 import문을 통해 소스파일에 사용된 클래스들의 패키지를 알아낸 후, 모든 클래스이름 앞에 패키지명 붙여줌.
			방법은 CTRL + SHIRT + O (의 위엄)
			참고 : import문은 프로그램 성능엔 영향을 미치지 않고 컴파일 시간이 조금 늘어날 뿐.
			
			소스파일(.java)의 구성 순서
			1. pakage문
			2. import문 ( import 패키지명.클래스명; 또는 import 패키지명.*; ) ( * 로 다 가져온다해도 성능상 차이는 없지만 어느 클래스가 어느 패키지에 속하는지 구분이 좀 어려워질 수 있다는 단점)
			3. 클래스 선언
			
			주의점 : imnport문에서 클래스 이름 대신 *을 사용하는 게 하위 패키지의 클래스까지 포함하진 않음.
			  	예 : import java.util.*;
			  	    import java.text.*;
			  	    
			  	    import java.*; 이거는 위 두 문장을 대신할 수 없다.

		 */
	}
}
