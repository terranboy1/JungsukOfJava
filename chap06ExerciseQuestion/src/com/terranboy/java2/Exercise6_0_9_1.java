package com.terranboy.java2;

public class Exercise6_0_9_1 {

	public static void main(String[] args) {
		//������ ��ǻ�� ������ ����(marine)�� Ŭ������ ������ ���̴�.
		//�� Ŭ������ ����߿� static�� �ٿ����ϴ� ���� � �͵��̰�
		//�� ������ �����ΰ�?
		//(��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)
	}
}

class Marine {
	int x=0, y=0;  // Marine ��ġ��ǥ(x,y)
	int hp = 60;   // ���� ü��
	int weapon = 6; //���ݷ�
	int armor = 0; //����
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//������ �Ʒ���











// weapon, armor, weaponUp(), armorUp()
