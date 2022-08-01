package abstraction;

public abstract class Innova extends Car {
	void noOfSeat() {
		System.out.println("innova has 7 seater");
	}
	void dashBoard() {
		System.out.println("music ,system,screen,charging,meter,pendrive");
	}
	void engine() {
		System.out.println("2400cc");
	}
	
		public String toString() {
			return brand+" "+price;
		}
	
	

}
