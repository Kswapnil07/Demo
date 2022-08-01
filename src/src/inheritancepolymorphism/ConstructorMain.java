package inheritancepolymorphism;

class A
{
	
	int a=10;
	A()
	{
		System.out.println("In default constructor A class");
	}
	
	A(int a)
	{
		System.out.println("In parameterized constructor A Class "+a);
	}
	
}


class B extends A
{
	
	int a=100;
	B()
	{
		// super(); //parent class default constructor it will be done by java
		super(100); //immediate parent class
		System.out.println("In default constructor B class");
	}
	
	B(int a)
	{
		//java will call the default constructor of parent class
		super(1000);
		//this(); //constructor chaining
		System.out.println("In parameterized constructor B Class "+a);
	}
	
	void display()
	{
		System.out.println("In class B display method "+super.a);
	}
	
}


public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new B(100);
		b.display();

	}

}
