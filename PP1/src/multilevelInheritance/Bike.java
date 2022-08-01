package multilevelInheritance;

public class Bike {

	int price;
	String color,model;
	
	void bikeData(int price,String color,String model) {
	
		this.price=price;
		this.color=color;
		this.model=model;
	}
	
	void seat() {
		System.out.println("minimun 2 seat");
		
	}
	
}
