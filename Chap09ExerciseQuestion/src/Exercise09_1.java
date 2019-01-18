
public class Exercise09_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1="+c1);  // 3K
		System.out.println("c2="+c2);  // 3K
		System.out.println("c1.equals(c2):"+c1.equals(c2)); //true
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof SutdaCard) {
			SutdaCard sc = (SutdaCard) obj;
			return num==sc.num && isKwang==sc.isKwang;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
