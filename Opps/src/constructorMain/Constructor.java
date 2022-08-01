package constructorMain;

class A{
	int a=10;
	A(){
		System.out.println("In default constructor A class");
	}
	A(int a){
		System.out.println("In parameterized constructor A class:"+a);
	}
}
class B extends A{
	int a=10;
	B(){
		System.out.println("In default constructor B class");
	}
	
	B(int a){
		super(100);
		System.out.println("In parameterized constructor B class:"+a);
		
	}
	void display() {
		System.out.println("In class B display methode"+super.a);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B(100);
		b.display();
	}

}
