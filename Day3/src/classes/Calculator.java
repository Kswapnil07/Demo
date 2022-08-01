package classes;

public class Calculator {
void mul() {
	int a=20,b=10;
	System.out.println("mul is :"+(a*b));
}
void div() {
	int a=20,b=10;
	System.out.println("div is :"+(a/b   ));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c1=new Calculator();
Calculator c2=new Calculator();
System.out.println();
c1.mul();
c2.div();
	}

}
