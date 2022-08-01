package inheritance;

public class Car {

	int launchyear,price;
	String name,brand;
	
	void setDataCar(int launchyear,int price,String name,String brand) {
		this.launchyear=launchyear;
		this.price=price;
		this.name=name;
		this.brand=brand;
	}
	void display() {
		System.out.println(launchyear+" "+price+" "+name+" "+brand);
	}
	}