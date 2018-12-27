
public class Four12 {
	public static void main(String[] args) {
		//구구단을 일부만 출력. 이건 좀 어렵더라.
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0 ? 3 : i%3;
				
				if(x>9)
					break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
	}
}
