package classs;

public class Calculator {

	void add() {
		int a=10,b=20;
		System.out.println((a+b));
	}
	void mul() {
		int a=20,b=10;
		System.out.println((a*b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		c.mul();
	}

}
