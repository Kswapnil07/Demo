package abstractioninjava;

class A
{
	public void display()
	{
		System.out.println("In Parent Display method");
	}
}

interface ABC
{
	void show();
	void display();
}


public class ClassInterfaceMain extends A implements ABC{
	
	public void display()
	{
		System.out.println("In child Display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterfaceMain c1= new ClassInterfaceMain();
		
		c1.display();
		

	}

	/*@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}*/

}
