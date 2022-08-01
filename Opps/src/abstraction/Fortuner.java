package abstraction;

public class Fortuner extends Car {

	void noOfSeat() {
		System.out.println("fortuner has 7 seater");
	}
	void dashBoard() {
		System.out.println("music ,system,screen,charging,meter,");
	}
	void engine() {
		System.out.println("2800cc");
	}
	
		public String toString() {
			return brand+" "+price;
		}
}
