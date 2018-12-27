import java.util.Scanner;

public class Four15_2 {
	public static void main(String[] args) {  
		int number = 12321;
		int tmp = number;
		String abc="";
		String bcd ="";
		
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			abc =tmp % 10 + "";
			bcd += abc;
			tmp /=10;
		}
		
		result = Integer.parseInt(bcd);
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
