
public class FlowEx22 {
	public static void main(String[] args) {
/*		
		향상된 for문
		for(타입 변수명 : 배열 또는 컬렉션) {       //배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장됨.
			반복할 문장
		}
*/	
		int[] arr = {10, 20, 30, 40, 50}; 
		
		System.out.println("이게 일반 for문");
		System.out.print("-> ");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("[%d] ", arr[i]);
		}
		System.out.println("");
		
		System.out.println("이게 향상된 for문");
		System.out.print("-> ");
		for(int tmp : arr) {      //향상된 for문이 더 간결. 근데 향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다는 제약이 있음.
			System.out.printf("[%d] ", tmp);
		}
		
		System.out.println("");
		System.out.println("향상된 for문을 이용해 각 배열의 요소들의 합을 구하기");
		System.out.print("-> ");
		
		int sum = 0;
		
		for(int tmp : arr) {
			sum += tmp;
		}
		System.out.println("각 배열 요소들의 합은" + sum + "입니다.");
		
		
		
		
	}
}
