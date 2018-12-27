
public class OperatorEx22 {

	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;    
		
		
		//이 부분은 내가 좀 부족했다. 잘 보고 숙지.
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);  // 10.0은 뒤가 0000이지만
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f);      // 0.1f는 뒤가 계속 있다.0.12904821904....이렇게..
		System.out.printf("f =%19.17f%n", f);
		System.out.printf("d =%19.17f%n", d);
		System.out.printf("d2 =%19.17f%n", d2);
		System.out.println(f==d2);  //호오..
	}
}


// 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있다.
// double d2 = (double)f;  float타입의 값을 double타입으로 형변환하면 부호와 지수는 달라지지 않고 가수의 빈자리를 0으로 채울뿐이라 값은 안달라짐.
