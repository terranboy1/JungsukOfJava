
public class ArrayEx3 {
	public static void main(String[] args) {
		//�迭�� ����
		
		//ù��° ���
		//int[] arr = new int[5];
		//int[] tmp = new int[arr.length*2];  //���� �迭���� ���� 2���� �迭 ����
		//for(int i = 0; i< arr.length; i++)
		//tmp[i] = arr[i];    //arr[i]�� ���� tmp[i]�� ����
		
        //arr = tmp;  //�������� arr�� ���ο� �迭�� ����Ű�� �Ѵ�. �׷� ������ arr�� ����Ű�� �ִ� �迭�� ���̻� �ڽ��� ����Ű�� ���������� ���� ������ ����� ���� ����. �迭�� ���������� ���ؼ��� ������ �����ϱ� �����̴�. �׷� ������ �� �迭�� JVM�� �������÷��Ϳ� ���� �޸𸮿��� ���ŵȴ�.)
		int[] arr = new int[5];
		
		//�迭 arr�� 1~5�� �����Ѵ�.
		for(int i=0; i<arr.length; i++)
			arr[i] = i + 1;
		
		System.out.println("[������]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
	
		//�迭 arr�� ����� ������ �迭 tmp�� ����
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;    //tmp�� ����� ���� arr�� ����.
		
		System.out.println("[������]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
	}
}
