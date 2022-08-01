package abstractioninjava;

public abstract class Innova extends Car{

	void noOfSeats()
	{
		System.out.println("Innova has 7 seats");
	}
	
	void dashBoard()
	{
		System.out.println("Music system, Screen, Charging, meter, pendrive");
	}
	
	void engine()
	{
		System.out.println(" 2400 cc");
	}
	
	public String toString()
	{
		return "Innova"+" "+brand+" "+price;
	}
	
}
