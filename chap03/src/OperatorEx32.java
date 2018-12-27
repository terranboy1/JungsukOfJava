
public class OperatorEx32 {

	public static void main(String[] args) {
		
/*		
		삼항연산자 ? :
		
		조건식 ? 식1 : 식2      조건식이 참이면 식1 거짓이면 식2
		
			예) result = (x>y) ? x : y;
		
		만약 x의 값이 5, y의 값이 3이라면 과정은 이와 같다.
		
			result = (x>y) ? x : y; 
       ---> result = (5>3) ? 5 : 3;
       ---> result = (true) ? 5 : 3;     조건식이 true(참)이므로 연산결과는 5
       ---> result = 5;		
       
       	이것을 if문으로 쓰면 다음과 같다. 딱봐도 삼항연산자가 간단하다. 삼항연산자가 if else문 축약형이구나.
       	    if(x>y)
       	       result = x;
       	    else
       	       result = y;
       	       
       	삼항연산자에서도 산술변환이 적용되어 두 피연산자의 타입이 다른 경우 큰 타입에 맞춰진다.
       	       예)
			result = (x>y) ? x : y; 
       ---> result = (5>3) ? 5 : 3.0;
       ---> result = (true) ? 5.0 : 3.0;    
       ---> result = 5.0;                    double타입이 되어부렀당!	
*/

		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다. (오 이거 절대값이잖아?)
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
/*
 *            절대값이 나와서 말인데 절대값 구할 때 if문으로 이렇게 썼었지?
 *      if(x>=0)
 *         x=x;
 *      else
 *         x=-x;
 */

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("y=%c%d\n", signY, absY);
		System.out.printf("z=%c%d\n", signZ, absZ);
	}
}
