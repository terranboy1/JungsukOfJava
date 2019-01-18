package test;

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
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(cart.length<=i) {
			Product[] cart1 = new Product[cart.length*2];
			System.arraycopy(cart, 0, cart1, 0, cart.length);
			cart = cart1;
		}
		cart[i++] = p;
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++) {
			sum += cart[i].price;
			itemList += cart[i]+",";
		}
		System.out.println("구매리스트:" + itemList);
		System.out.println("구매총액:" + sum + "만원");
		System.out.println("잔액:" + money + "만원");
	}
}

class Product {
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {super(100);}
	
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
}


class Audio extends Product {
	Audio() {super(50);}
	
	public String toString() {return "Audio";}
}

