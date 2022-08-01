package abstractioninjava;

public class Fortuner extends Car{
	
	void noOfSeats()
	{
		System.out.println("Innova has 7 seats");
	}
	
	void dashBoard()
	{
		System.out.println("Music system, Screen, meter,");
	}
	
	void engine()
	{
		System.out.println(" 2800 cc");
	}
	
	public String toString()
	{
		return "Fortuner"+" "+brand+" "+price;
	}
	
	

}
