package inheritancepolymorphism;

public class AdditionOverloading {
	
	void add(int a,int b)
	{
		System.out.println("Addition of 2 numbers is: "+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Addition of 3 numbers is: "+(a+b+c));
	}
	
	void add(float a,float b)
	{
		System.out.println("Addition of 2 numbers(float,float) is: "+(a+b));
	}

	void add(float a,int b)
	{
		System.out.println("Addition of 2 numbers(float,int) is: "+(a+b));
	}
	
	void add(int a, float b)
	{
		System.out.println("Addition of 2 numbers(int,float) is: "+(a+b));
	}
	
	void add(String a,String b)
	{
		System.out.println("Addition of 2 Strings is: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionOverloading a1= new AdditionOverloading();
		
		a1.add(10, 20);
		a1.add(10, 20,30);
		a1.add(2.5f,10);
		a1.add(2.5f, 5.6f);
		a1.add("ABC", "XYZ");

	}

}
