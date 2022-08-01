package inheritancepolymorphism;

public class PulsorRs extends Pulsor{
	
	String engine;
	int speed;
	
	void setPulsorRsData(String engine,int speed)
	{
		this.engine=engine;
		this.speed= speed;
	}
	
	public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+"kg  "+price+" "+color+" "+speed+" "+engine+"cc";
	}
	
	void gears()//overridden methods
	{
		super.gears();
		//super.wheelno();
		System.out.println("Pulsors RS has 6 gears");
	}
	

}
