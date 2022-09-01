package abstraction;

public abstract class Car {

	int price;
	String brand;
	 void detData(int price, String brand) {
		this.price=price;
		this.brand=brand;
	}
	void wheelNo() {
		System.out.println("4 wheels");
	}
	void gears() {
		System.out.println("5 gears");
	}
	abstract void noOfSeat();
	abstract void dashBoard();
	abstract void engine();
	abstract void wheelType();
}
