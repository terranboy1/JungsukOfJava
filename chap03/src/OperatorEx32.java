
public class OperatorEx32 {

	public static void main(String[] args) {
		
/*		
		���׿����� ? :
		
		���ǽ� ? ��1 : ��2      ���ǽ��� ���̸� ��1 �����̸� ��2
		
			��) result = (x>y) ? x : y;
		
		���� x�� ���� 5, y�� ���� 3�̶�� ������ �̿� ����.
		
			result = (x>y) ? x : y; 
       ---> result = (5>3) ? 5 : 3;
       ---> result = (true) ? 5 : 3;     ���ǽ��� true(��)�̹Ƿ� �������� 5
       ---> result = 5;		
       
       	�̰��� if������ ���� ������ ����. ������ ���׿����ڰ� �����ϴ�. ���׿����ڰ� if else�� ������̱���.
       	    if(x>y)
       	       result = x;
       	    else
       	       result = y;
       	       
       	���׿����ڿ����� �����ȯ�� ����Ǿ� �� �ǿ������� Ÿ���� �ٸ� ��� ū Ÿ�Կ� ��������.
       	       ��)
			result = (x>y) ? x : y; 
       ---> result = (5>3) ? 5 : 3.0;
       ---> result = (true) ? 5.0 : 3.0;    
       ---> result = 5.0;                    doubleŸ���� �Ǿ�η���!	
*/

		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x�� ���� �����̸�, ����� �����. (�� �̰� ���밪���ݾ�?)
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
/*
 *            ���밪�� ���ͼ� ���ε� ���밪 ���� �� if������ �̷��� �����?
 *      if(x>=0)
 *         x=x;
 *      else
 *         x=-x;
 */

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // ���� �����ڸ� ��ø
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("y=%c%d\n", signY, absY);
		System.out.printf("z=%c%d\n", signZ, absZ);
	}
}
