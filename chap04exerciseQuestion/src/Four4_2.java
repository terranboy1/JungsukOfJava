
public class Four4_2 {
	public static void main(String[] args) {
		int sum = 0;
		int s = 1; //값의 부호를 바꿔주는 데 사용할 변수
		int num = 0;
		
		//조건값이 true이므로 무한반복
		for(int i=1; sum<=100; i++, s=-s) {  //매 반복마다 s 값은 1, -1, 1, -1...
			num = s * i;                // i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		}
		

	}
}
