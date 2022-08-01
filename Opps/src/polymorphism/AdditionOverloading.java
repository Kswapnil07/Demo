	package polymorphism;

public class AdditionOverloading {

	void add(int a,int b) {
		System.out.println("addition of two numbers:"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("addition of three number:"+(a+b+c));
	}
	void add(float a,float b) {
		System.out.println("add two number (float,float) is:"+(a+b));
	}
	void add(float a,int b) {
		System.out.println("add two number (float,int) is :"+(a+b));
	}
	void add(String a,String b) {
		System.out.println("add of two String:"+(a+b));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOverloading a1=new AdditionOverloading();
		a1.add(10, 20);
		a1.add(10, 20, 30);
		a1.add(2.5f, 03.5f);
		a1.add(3.5f, 10);
		a1.add("abc", "xyz");
		
	}

}
