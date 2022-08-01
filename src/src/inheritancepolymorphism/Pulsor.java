package inheritancepolymorphism;

public class Pulsor extends Bike{//Parent
	
	int weight;
	String name,modelno;
	
	void setPulsorData(String name,int weight,String modelno)
	{
		this.weight=weight;
		this.modelno=modelno;
		this.name=name;
	}
	/*void engine()
	{
		System.out.println("220 cc");
	}*/
	
	/*public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+"kg  "+price+" "+color;
	}*/
	
	public void gears()
	{
		super.gears();
		System.out.println("Pulsor has 5 gears");
	}
	

}
