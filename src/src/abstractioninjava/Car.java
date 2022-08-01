package abstractioninjava;

public abstract class Car {//cannot create object of abstract class
	
	int price;
	String brand;
	
	void setData(int price, String brand)
	{
		this.brand=brand;
		this.price=price;
	}
	void wheelno()
	{
		System.out.println("4 wheels");
	}
	
	void gears()
	{
		System.out.println("5 gears");
	}
	
	abstract void noOfSeats(); //override
	abstract void dashBoard();
	abstract void engine();
	abstract void wheelType();
	

}
