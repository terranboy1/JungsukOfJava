
public class Chap07_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(cart.length<=i) {
			Product[] doubleCart = new Product[cart.length*2];
			System.arraycopy(cart, 0, doubleCart, 0, cart.length);
			cart = doubleCart;
		}
		cart[i++] = p;
	}
	
	void summary() {
		int sum = 0; //토탈가격
		String itemList ="";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				System.out.println("구입한게없심");
				return;
			}
			itemList += cart[i] + ",";
			sum += cart[i].price;
			
		}	
		System.out.println(itemList);
		System.out.println(sum);
		System.out.println(money);
	}
}

class Product {
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {super(100); }
	
	public String toString() {return "TV";}
}

class Computer extends Product {
	Computer() {super(200); }
	
	public String toString() {return "Computer";}
}

class Audio extends Product {
	Audio() {super(50); }
	
	public String toString() {return "Audio";}
}