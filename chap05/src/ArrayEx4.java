import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		//System.arraycopy()을 이용한 배열의 복사
		
		//for문 대신 System클래스의 arraycopy()를 사용하면 보다 간단하고 빠르게 배열 복사 가능.
		//for문은 배열의 요소 하나하나에 접근해서 복사하지만, arraycopy()는 지정된 범위의 값들을 한 번에 통째로 복사함.
		//각 요소들이 연속적으로 저장되어 있다는 배열의 특성 때문에 이렇게 처리가 가능한 것!
		//결론: 배열 복사는 for문 < System.arraycopy() 임돠.
		
		//System.arraycopy()을 이용한 배열복사 예제
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		//배열 abc와 num을 붙여 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];  //두 배열의 길이 더해줌.
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc를 배열 num의 첫 번째 위치에서 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		//이것은 나의 응용. 맨 마지막 9를 D로 만들기
		System.arraycopy(abc, 3, num, 9, 1);
		System.out.println(num);

	}
}
