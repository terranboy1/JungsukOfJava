import java.util.Scanner;

public class FlowEx32_1 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 제곱");
			System.out.println("(2) 제곱근");
			System.out.println("(3) 로그");
			System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {                                       //break문을 이용해 프로그램 종료 메뉴 만들기
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");  //잘못된 값을 선택했을 경우 다시 처음으로 돌려보내는 continue문
				continue;
			} 
			
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}

	}

}
