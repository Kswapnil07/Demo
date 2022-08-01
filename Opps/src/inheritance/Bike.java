package inheritance;

public class Bike {

	int price;
	String colour,model,milage;
	
	void setBikeData(int price,String colour,String model,String milage) {
		this.price=price;
		this.colour=colour;
		this.model=model;
		this.milage=milage;
	}
//	public String toSring() {
//		return price+" " +colour+" "+model+" "+milage;
//	}
	
	void wheelno() {
		System.out.println("2 wheels");
	}
	void seats() {
		System.out.println("2 seats");
	}
}
