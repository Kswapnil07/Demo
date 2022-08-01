package inheritance;

public class Bike {

	int price;
	String color,model;
	
	void bikeData(int price,String color,String model)
	{
		this.price=price;
		this.color=color;
		this.model=model;
	}
	
	void wheel() {
		System.out.println("wheel are 4");
	}
}
