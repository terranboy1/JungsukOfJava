import java.util.Arrays;

public class Chap09_0_8 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone(); //�迭 arr�� ������ ���� ������ ���ο� �迭 ����
		arrClone[0]= 6;

		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}