package interface1;

public class SciCalculator implements Calculator {
	int a,b;
	void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void add() {
		int c=a+b;
		
		System.out.println("add of two no:"+(c));
	}
	public void subtract() {
		int c=a-b;
		System.out.println("add of sub no:"+(c));
	}
	public void multiply() {
		int c=a*b;
		System.out.println("add of mul no:"+(c));
	}
	public void divide() {
		int c=a/b;
		System.out.println("add of div no:"+(c));
	}
	public void power() {
		System.out.println("power:"+Math.pow(2, 3));
	}
	public void squar() {
		System.out.println("sqtr:"+Math.sqrt(16));
	}

	
}
