
public class FlowEx22 {
	public static void main(String[] args) {
/*		
		���� for��
		for(Ÿ�� ������ : �迭 �Ǵ� �÷���) {       //�迭 �Ǵ� �÷��ǿ� ����� ���� �� �ݺ����� �ϳ��� ������� ������ ������ �����.
			�ݺ��� ����
		}
*/	
		int[] arr = {10, 20, 30, 40, 50}; 
		
		System.out.println("�̰� �Ϲ� for��");
		System.out.print("-> ");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("[%d] ", arr[i]);
		}
		System.out.println("");
		
		System.out.println("�̰� ���� for��");
		System.out.print("-> ");
		for(int tmp : arr) {      //���� for���� �� ����. �ٵ� ���� for���� �Ϲ����� for���� �޸� �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ����� �� �ִٴ� ������ ����.
			System.out.printf("[%d] ", tmp);
		}
		
		System.out.println("");
		System.out.println("���� for���� �̿��� �� �迭�� ��ҵ��� ���� ���ϱ�");
		System.out.print("-> ");
		
		int sum = 0;
		
		for(int tmp : arr) {
			sum += tmp;
		}
		System.out.println("�� �迭 ��ҵ��� ����" + sum + "�Դϴ�.");
		
		
		
		
	}
}
