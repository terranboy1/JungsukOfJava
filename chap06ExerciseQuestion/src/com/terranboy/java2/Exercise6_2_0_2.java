package com.terranboy.java2;

import java.util.Arrays;

public class Exercise6_2_0_2 {
	//������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	//(Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
	//
	//�޼���� : shuffle
	//��� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��� �ڼ��̰� ��.
	//��ȯŸ�� : int[]
	//�Ű����� : int[] arr - �������� ��� �迭
	
	static int[] shuffle(int[] arr) {
		
		if(arr == null || arr.length == 0)  //��ȫ..��ȿ���˻� ���� ���ߴ� �� �迭�� null�̰ų� 0�̸� �״�� ��ȯ!
			return arr;
		
		for(int i=0; i<arr.length; i++) {
			int x = (int)(Math.random()*8)+1;
			int tmp = arr[i];
			arr[i] = arr[x];
			arr[x] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

}
