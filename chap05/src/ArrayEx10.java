import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		//�����ϱ�(���� �� �Դ�!)
		int[] numArr = {9,8,7,6,5,4,3,2,1,0};
		int[] numArr1 = {9,8,7,6,5,4,3,2,1,0};
		
		for(int i=0; i<numArr.length-1; i++) {  // 0<=i<9
			System.out.println(Arrays.toString(numArr1) + "����");
			boolean changed = false; //�� �ݺ����� changed�� false�� �ʱ�ȭ
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {  //���� ���� ������ ���� �ٲ۴�.  �������� �Ϸ��� �� ���Ǹ� �ٲ��ָ�ǳ� ����
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;   //�ڸ��ٲ��� �߻������� changed�� true�� �ٲ۴�.
					System.out.print(Arrays.toString(numArr));
				}
				System.out.println();
			}
			
			if(!changed) break;  //�ڸ��ٲ��� ������ �ݺ��� ���.
			
			for(int k=0; k<numArr.length;k++) {
				System.out.print(numArr[k]); //���ĵ� ����� ���
			}
			System.out.println();
			
		}
	}
}
