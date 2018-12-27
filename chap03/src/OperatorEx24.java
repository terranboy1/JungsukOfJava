class OperatorEx24 {
	public static void main(String args[]) { 
		int  x = 0;
		char ch = ' ';

		//논리연산자 && || ! (값이 true or false로 나오는 것들은 논리연산자~)
		//&&(and)연산자나 ||(or)연산자같은 경우엔 앞에꺼에서 검증되면 뒤에 식 자체를 실행을 안함.
		//and연산자같은 경우엔 앞에께 틀리면 뒤에껄 실행 안하고, or연산자같은 경우엔 앞에께 맞으면 뒤에껄 실행 안함.
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);  
		
		x = 6;
		System.out.printf("x=%2d,  x%%2==0 || x%%3==0  && x%%6!=0 =%b\n", x, x%2==0||x%3==0&&x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b\n", x,(x%2==0||x%3==0)&&x%6!=0);

		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b\n", ch, '0' <= ch && ch <='9');

		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b\n", ch, 'a' <= ch && ch <='z');

		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b\n", ch, 'A' <= ch && ch <='Z');
		
		//문자인가? 
		// if(('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z'){}

		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b\n", ch, ch=='q' || ch=='Q');
	}
}
