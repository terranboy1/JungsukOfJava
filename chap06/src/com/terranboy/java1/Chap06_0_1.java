package com.terranboy.java1;

public class Chap06_0_1 {
	public static void main(String[] args) {
		//��ü������
		//------------------------------------------------------------------------------------------------------------------
		//��ü�����̷��� �⺻ ���� : 1) ���� �����(�繰)�� �̷���� ������, �߻��ϴ� ��� ��ǵ��� �繰���� ��ȣ�ۿ��̴�.
		//                        2) ���� �繰�� �Ӽ��� ����� �м��� ���� ������(����)�� �Լ��� ���������ν� ���� ���踦 ����.
		//                        3) ��ü������� ������ ���α׷��� ���� �ٸ� ���� ���ο� ���� �ƴϰ�, ���� ���α׷��� �� �� ���� ���ο� ��Ģ�� �߰��� ���� ������ ������ ��.
		//                        4) �̷��� ��Ģ���� �̿��� �ڵ� ���� ���� ���踦 �ξ� �����ν� ���� ���������� ���α׷��� �����ϴ� ���� ��������.
		//
		//��ü�������� �ֿ� Ư¡ : 1) �ڵ��� ���뼺�� ����.(�ٵ� �̰� �輺�� �������� �ణ �ָ��ϴٰ� ����.)
		//                        2) �ڵ� ������ �����ϴ�. (�ڵ尣 ���踦 �̿��� ���� ������� ���� �ڵ� ����)
		//                        3) �ŷڼ��� ���� ���α׷����� ��������(ĸ��ȭ, �ߺ� ���ŷ� ���� ���۵� ����)
		//
		//��ü���� ���α׷����� ���α׷��ӿ��� �Ž��� �������� ������ �� �ִ� �ɷ��� �䱸�ϱ� ������ ��ü���ⰳ���� �����ߴ� �ϴ���
		//�������� ����� Ȱ���Ϸ��� �Ʒ��� ���� �ؾ� �Ѵ�.(���ذ� ����� �̾����� �ʴ´ٴ� ��.)
		
		//Ŭ������ ��ü
		//------------------------------------------------------------------------------------------------------------------
		//Ŭ������ ���� : 1) ��ü�� �����س��� ��  2) ��ü�� ���赵 �Ǵ� Ʋ           
		//Ŭ������ �뵵 : 1) ��ü�� �����ϴ� �� ���.
		//
		//��ü�� ���� : 1) ������ �����ϴ� ��, �繰 �Ǵ� ����
		//��ü�� �뵵 : 1) ��ü�� ������ �ִ� ��ɰ� �Ӽ��� ���� �ٸ�(��ü=����+���� / ��ü=���+�Ӽ�)
		//
		//��) TV ���赵(Ŭ����)�� TV��� ��ǰ(��ü)�� ������ ���̰�, TV(��ü)�� ����� �� ����.
		//
		// �ϳ��� ���赵�� �� ����� ������ ��ǰ�� ����� ���� ������.(���赵��θ� ����� �Ǵϱ�)
		// ���������� Ŭ������ �� �� �� ����� ���⸸ �ϸ�, �Ź� ��ü�� ������ ������ ��ü�� ��� �������� �� ���� ���ص� ��.
		// JDK���� ���α׷����� ���� ���� ���� ������ Ŭ����(API)�� �����ϹǷ� �츮�� �� Ŭ�������� �̿��� ���ϴ� ����� ���α׷��� ���� �ۼ� ����.
		// 
		// �ν��Ͻ�ȭ��? Ŭ�����κ��� ��ü�� ����� ����.(��ü�� ��� �ν��Ͻ��� ��ǥ�ϴ� ������ �ǹ�, �ν��Ͻ��� ���� ��ü���� �ǹ�)
		// ��) å���� ��ü�� / å���� å�� Ŭ������ ��ü�� / å���� å�� Ŭ������ �ν��Ͻ���
		//
		// ��ü = �Ӽ�(�������, Ư��, �ʵ�, ����) + ���(�޼���, �Լ�, ����)
		//
		// ��) �Ӽ� : ũ��, ����, ����, ����, ����, ä�� 
		//     ��� : �ѱ�, ����, ���� ���̱�, ���� ���̱�, ä�� �����ϱ�.
		
		// ���� TV�� ���� ��ɰ� �Ӽ��� �� �ܿ��� �� ������, ���α׷��ֿ� �ʿ��� �Ӽ��� ��ɸ��� ������ Ŭ������ �ۼ��ϸ� ��.
		
		// �� ������ �ڷ����� �Ӽ��� ���� �´� ���� ����.
		
		// TvŬ���� ������
		// class Tv{
		//       String color;  //����
		//       boolean power; //��������      ----------->  ����
		//       int channel;   //ä��
		//
		//       void power() {power = !power;}
		//       void channelUp() {channel++} -----------> �޼���
		//       void channelDown() {channel--}
		
		// �ν��Ͻ��� ������ ���
		// -----------------------------------------------------------------------------------------------------------------------
		// TvŬ������ ������ ���� Tv���赵�� �ۼ��� �Ϳ� �Ұ��ϹǷ� Tv�ν��Ͻ��� �����ؾ� ��ǰ�� ����� �� �ִ�.
		// �ν��Ͻ��� �����ϴ� ����� ���������� ������ �Ϲ������� ������ ����.
		//
		// Ŭ������ ������;           //Ŭ������ ��ü�� �����ϱ� ���� �������� ����
		// ������ = new Ŭ������();   //Ŭ������ ��ü ���� ��, ��ü�� �ּҸ� ���������� ����.
		//
		// Tv t;
		// t = new Tv();
		
		Tv t;            //TvŬ���� Ÿ���� �������� t ����. �޸𸮿� �������� t�� ���� ������ ���õ�. ���� �ν��Ͻ��� ��� �̰ɷ� �ƹ��͵� �� �� ����.
		t = new Tv();    //������ new�� ���� TvŬ������ �ν��Ͻ��� �޸� ������� ������. �� �� ��������� �� �ڷ����� �ش��ϴ� �⺻������ �ʱ�ȭ��. �׸��� ���Կ����ڿ� ���� �ν��Ͻ��� �ּҰ� ���������� �����. ���� �������� t�� ���� Tv�ν��Ͻ��� ���� ����. �ν��Ͻ��� �ٷ�� ���ؼ� ���������� �ݵ�� �ʿ�.(�������� ������ �������÷��ʹ���...)	
		t.channel = 7;   //�������� t�� ����� �ּҿ� �ִ� �ν��Ͻ��� ������� channel�� 7�� ����. �ν��Ͻ��� �������(�Ӽ�)�� ����Ϸ��� '��������.�������'�� ���� �ϸ� ��. 
		t.channelDown(); //�������� t�� �����ϰ� �ִ� Tv�ν��Ͻ��� channelDown�޼��� ȣ��.
		System.out.println("���� ä��" + t.channel);
	}
}		
		//�ν��Ͻ��� ���������� ����� ��ġ �츮�� �ϻ��Ȱ���� ����ϴ� TV�� TV�������� ����� ����.
		//TV������(��������)�� ����� TV(�ν��Ͻ�)�� �ٷ�� ����.
		//�ٸ� ���� ���� TV�� TV�� ���� ��ư�� �̿��� ������ ����������, �ν��Ͻ��� ���� ���������θ� �ٷ� �� �ִٴ� ��!
		//�׸��� TV�� TV������, �������� �������������� �ֵ��� Tv�ν��Ͻ��� ����Ϸ��� TvŬ���� Ÿ���� ���������� �ʿ��ϴ�.
		//=�������� Ÿ���� �ν��Ͻ��� Ÿ�԰� ���ƾ� �Ѵ�. Tv t = new Tv();