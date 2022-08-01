package inheritancepolymorphism;

final class A1 //cannot be subclassed or inherited
{
	final int a=100; //constant
	
	final void display() //child class cannot override final method
	{
		//a=1000;
		System.out.println("Inside display method A class");
	}
}
public class B extends A1
{
	
	void display()
	{
		//a=200;
		System.out.println("Inside display method B class "+a);
	
		
	}
}
