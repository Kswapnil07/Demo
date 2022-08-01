package abstraction1;

public abstract class Bike {

	int price;
	String color,brand;
	
	void setDataBike(int price,String color,String brand) {
		this.price=price;
		this.color=color;
		this.brand=brand;
		
	}
	void display() {
		System.out.println(price+" "+color+" "+brand);
	}
	void wheelno() {
		System.out.println();
	}
	void mirror() {
		System.out.println("2 mirror");
	}
	abstract void gears();
	abstract void features();
	abstract void seatno();
	abstract void discount();
	
	
}

