package inheritance;

public class Dog extends Animal {
	
	void bark()
	{
		System.out.println("breaking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		
		d.bark();
		d.eat();
	}

}
