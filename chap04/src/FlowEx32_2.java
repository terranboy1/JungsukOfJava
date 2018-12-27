import java.util.Scanner;

public class FlowEx32_2 {

	public static void main(String[] args) {
		String menu;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 제곱");
			System.out.println("(2) 제곱근");
			System.out.println("(3) 로그");
			System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");
			
			menu = scanner.nextLine();
			
			if(menu.equals("0")) {                                       //break문을 이용해 프로그램 종료 메뉴 만들기
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(menu.equals("1")) {
				System.out.println("선택하신 메뉴는 " + menu + "번입니다.");  //잘못된 값을 선택했을 경우 다시 처음으로 돌려보내는 continue문
			} else if(menu.equals("2")) {
				System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
			} else if(menu.equals("3")) {
				System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
			} else {
				System.out.println("잘못된 입력입니다. 올바른 값을 입력해주세요.");
				continue;
			}
		}
	}
}
