package multilevelInheritance;

public class Bike {
	int price;
	String colour,model,milage;
	
	void setBikeData(int price,String colour,String model,String milage) {
		this.price=price;
		this.colour=colour;
		this.model=model;
		this.milage=milage;
	}
	void gears() {
		System.out.println("minimum 4 gears");
	}
	void wheelno() {
		System.out.println("2 wheels");
	}
	void seats() {
		System.out.println("2 seats");
	}

}
