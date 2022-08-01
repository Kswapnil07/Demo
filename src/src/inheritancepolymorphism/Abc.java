package inheritancepolymorphism;

public class Abc {
	
	Abc(int a)
	{
		this();
		System.out.println("In Single Parameter constructor "+a);
	}
	
	Abc()
	{
		//this(100);
		System.out.println("In default constructor");
	}
	
	Abc(int a,int b)
	{
		this(100);
		System.out.println(a+" In 2 parameter constructor "+b);
		
	}
	
	Abc(int a,int b,int c)
	{
		this(1000,2000);
		System.out.println(a+" In 3 parameter constructor "+b+" "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc a= new Abc(110,20,30);

	}

}
