
public class OperatorEx2 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;   //후위형
		System.out.println("j=i++; 실행후, i=" + i +", j="+j);
		
		i=5;  // 결과를 비교하기 위해 i와 j의 값을 다시 5와 0으로 변경
		j=0;
		
		j = ++i;   //전위형
		System.out.println("j=i++; 실행후, i=" + i +", j="+j);
	}
}


//전위형은 i값을 일단 증가시키고 j에 넣지만
//후위형은 i값을 일단 넣고 계산 후 해당 코드가 끝나면 1 증가시킨다.
//좀더 쉽게 정리하면
//                                       전위형                                       후위형
//                   ++i;  증가 후에                           j = i; 참조해 대입 후에
//                  j = i; 참조해 대입                         i++;  증가