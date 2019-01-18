
import java.util.StringJoiner;

public class Chap09_0_18 {
	public static void main(String[] args) throws Exception {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		System.out.println(sb);
		
		StringBuffer sb2 = sb.append("456");  //append()�� ��ȯŸ���� StringBuffer�� �ּҸ� ��ȯ�Ѵ�. sb�� �ּҰ��� sb2�� ����Ű�� �ϴ°�. ���� �ν��Ͻ��� ����Ű�� ��.
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("abc");
		sb3.append("123").append("456"); //�䷸�� ����ȣ�� ����. ������? �ּҸ� ��ȯ�ϴϱ�~
		System.out.println(sb3);
		
		System.out.println("sb2==sb3�� �����" + (sb2==sb3));
		System.out.println("sb2.equals(sb3)�� �����" + sb2.equals(sb3));
		
		//StringBufferŬ������ equals()�� �������̵��Ǿ����� �ʰ� toString()�� �������̵��Ǿ��־
		//���ڿ��� ������ ���Ϸ��� �̷��� String��ü�� ������ �Ѵ�.
		String aaa = sb2.toString();
		String bbb = sb3.toString();
		System.out.println(aaa.equals(bbb));
		
		System.out.println();
		System.out.println("���뼱");
		System.out.println("----------------------------------------");
		
		StringBuffer sb10 = new StringBuffer("abc");
		StringBuffer sb11 = new StringBuffer("abc");
		
		System.out.println("sb10 == sb11 ? " + (sb10==sb11));
		System.out.println("sb10.equals(sb11) ? " + sb10.equals(sb11));
		
		//StringBuffer�� ������ String���� ��ȯ
		String s = sb10.toString();  // String s = new String(sb); �� ����.
		String s2 = sb11.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		
		StringBuffer sb12 = new StringBuffer();
		sb12.append(true);
		System.out.println(sb12);
		
	}
}
