
public class Exercise5_0_7 {

	public static void main(String[] args) {
		//����5_0_6�� ������ ������ �߰��� ���α׷��̴�.
		//Ŀ�ǵ�������κ��� �Ž����� �ݾ��� �Է¹޾� ����Ѵ�.
		//������ ������ ������ �Ž������� ������ �� ������
		//'�Ž������� �����մϴ�.' ��� ����ϰ� �����Ѵ�.
		//������ ���� ����� ������, �Ž������� ������ ��ŭ
		//���� ������ ���� ���� ������ ������ ȭ�鿡 ����Ѵ�.
		//(1)�� �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_0_7 3120");
			System.exit(0);
		}
		
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���� �߻�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; //������ ����
		int[] coin = {5, 5, 5, 5};           //������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {  //�迭���� 4
			int coinNum = 0;
			
			//(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			
			//1. �ݾ�(money)�� ���� ������ ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
			coinNum = money/coinUnit[i];
			
			//2.�迭 coin���� coinNum��ŭ ������ ����.
			//  (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			if(coin[i]>=coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum=coin[i];
				coin[i]=0;
			}
			
			//3.�ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			money -= coinNum*coinUnit[i];
			
			
			System.out.println(coinUnit[i]+"��: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);  //���α׷��� �����Ѵ�.
		}
		
		System.out.println("=���� ������ ���� =");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��:"+coin[i]);
		}
	}
}
