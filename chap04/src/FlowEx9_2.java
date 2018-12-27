import java.util.*;

class FlowEx9_2 {
	public static void main(String[] args) { 
		int score  = 0;
		char grade = ' ';
		char opt = ' ';  //³»°¡ µî±Ş Ãß°¡ÇÏ·Á°í ¸¸µê

		System.out.print("´ç½ÅÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.(1~100)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // È­¸éÀ» ÅëÇØ ÀÔ·Â¹ŞÀº ³»¿ëÀ» tmp¿¡ ÀúÀå
		score = Integer.parseInt(tmp);   // ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­(tmp)¸¦ ¼ıÀÚ·Î º¯È¯

		
		//Á¶°Ç½ÄÀÌ ÇÏ³ª¿©¼­ ¼Óµµ¸é¿¡¼± ºü¸£Áö¸¸ case¹®ÀÌ ³Ê¹« ¸¹¾ÆÁ® ÁÁÁö ¾ÊÀº ÄÚµå°¡ µÇ¾ú´Ù.
		//¹İµå½Ã ¼Óµµ¸¦ ´õ Çâ»ó½ÃÄÑ¾ß ÇÑ´Ù¸é º¹ÀâÇÏ´õ¶óµµ ÀÌ·¸°Ô switch¹®À» »ç¿ëÇØ¾ß°ÚÁö¸¸
		//±×·¸Áö ¾Ê´Ù¸é if¹® ¾²´Â°É ®”Çö.
		switch(score) {
			case 100: case 99: case 98: 
				grade = 'A';
				opt = '+';
				break;
			case 97: case 96: case 95:  case 94: 
				grade = 'A';
				opt = '0';
				break;
				
			case 93: case 92: case 91: case 90 :
				grade = 'A';
				opt = '-';
				break;

			case 89: case 88: case 87: case 86:
			case 85: case 84: case 83: case 82: case 81:
			case 80 :
				grade = 'B';
				break;
			case 79: case 78: case 77: case 76:
			case 75: case 74: case 73: case 72: case 71:
			case 70 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		} // end of switch

		System.out.println("´ç½ÅÀÇ ÇĞÁ¡Àº "+ grade + opt +"ÀÔ´Ï´Ù.");
	} // mainÀÇ ³¡
}
