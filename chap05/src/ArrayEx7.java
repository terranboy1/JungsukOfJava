
public class ArrayEx7 {

	public static void main(String[] args) {
		
		//�迭 shuffle�ϱ�.
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;  //�迭�� 0~9�� ���ڷ� �ʱ�ȭ
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<20; i++) {
			int n = (int)(Math.random()*10);   // 0~9�� ���� �� �ϳ��� ���� n�� ����.  index���� �ߺ��� �� ���ܵ� ���� ���鿡 �ߺ��� �Ȼ����. �̰� ����Ʈ����. �ǳ� ���Ⱦ�.
			int tmp = numArr[0];               // numArr[0]�� ���� ���� tmp�� ����.
			numArr[0] = numArr[n];             // numArr[n] ���� numArr[0]�� ����.
			numArr[n] = tmp;                   // numArr[n]�� tmp���� ����.
		}
		
//		for(int i=0; i<numArr.length; i++) {
//			int n = (int)(Math.random()*10);   // 0~9�� ���� �� �ϳ��� ���� n�� ����.  index���� �ߺ��� �� ���ܵ� ���� ���鿡 �ߺ��� �Ȼ����. �̰� ����Ʈ����. �ǳ� ���Ⱦ�.
//			int tmp = numArr[i];               // numArr[0]�� ���� ���� tmp�� ����.
//			numArr[i] = numArr[n];             // numArr[n] ���� numArr[0]�� ����.
//			numArr[n] = tmp;                   // numArr[n]�� tmp���� ����.
//		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
