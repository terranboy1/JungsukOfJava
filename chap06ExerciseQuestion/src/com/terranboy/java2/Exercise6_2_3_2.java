package com.terranboy.java2;

import java.util.Arrays;

public class Exercise6_2_3_2 {

	//������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	//�޼���� : max
	//       ��� : �־��� int�� �迭�� �� �� ���� ū �� ��ȯ
	//                 ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ
	//��ȯŸ�� : int
	//�Ű����� : int[] arr - �ִ밪�� ���� �迭
	
	static int max(int[] arr) {
		if(arr ==null || arr.length == 0)
			return -999999;
		
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[] {})); //ũ�Ⱑ 0�� �迭
	}
}

//������
//
//{3, 2, 9, 4, 7}
//�ִ밪:9
//�ִ밪:-999999
//�ִ밪:-999999
