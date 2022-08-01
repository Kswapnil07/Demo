package inter;

class A
{
	 void display() {
		System.out.println("In parent display methode ");
	}
}
interface ABC
{
	void show();
	void display();
	
}

public class ClassInterfaceMain extends A implements ABC {
	public void display() {
		System.out.println("In child display methode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassInterfaceMain c1=new ClassInterfaceMain();
			c1.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
