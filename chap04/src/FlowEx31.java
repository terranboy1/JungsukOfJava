
public class FlowEx31 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;    // ���ǽ��� ���� �Ǿ� continue���� ����Ǹ� �� ������ �̵�. break���� �޸� �ݺ����� ����� �ʴ´�. �� �ٽ�, �� ������ ���� ���ƿ��� �Ǵ� ���̴�!
							 // 3�� ����� ���ܵǾ���.
			System.out.println(i);
		}
	}

}
