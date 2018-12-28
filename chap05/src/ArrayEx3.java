
public class ArrayEx3 {
	public static void main(String[] args) {
		//배열의 복사
		
		//첫번째 방법
		//int[] arr = new int[5];
		//int[] tmp = new int[arr.length*2];  //기존 배열보다 길이 2배인 배열 생성
		//for(int i = 0; i< arr.length; i++)
		//tmp[i] = arr[i];    //arr[i]의 값을 tmp[i]에 저장
		
        //arr = tmp;  //참조변수 arr이 새로운 배열을 가리키게 한다. 그럼 기존에 arr이 가리키고 있던 배열은 더이상 자신을 가리키는 참조변수가 없기 때문에 사용할 수가 없다. 배열은 참조변수를 통해서만 접근이 가능하기 때문이다. 그럼 기존의 이 배열은 JVM의 가비지컬렉터에 의해 메모리에서 제거된다.)
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다.
		for(int i=0; i<arr.length; i++)
			arr[i] = i + 1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
	
		//배열 arr에 저장된 값들을 배열 tmp에 복사
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;    //tmp에 저장된 값을 arr에 저장.
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
	}
}
