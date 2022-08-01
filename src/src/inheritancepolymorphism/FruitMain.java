package inheritancepolymorphism;

class Fruit
{
	void eat()
	{
		System.out.println("fruits are good for health");
	}
}

class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Apples arevery good for eyes");
	}
}

class Strawberry extends Fruit
{
	void eat()
	{
		System.out.println("Strawberries are sweet in taste");
	}
}

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic method dispatch
		/*Apple a1= new Apple();
		a1.eat();*/
		
		Fruit f1= new Fruit();
		f1.eat();
		
		f1= new Apple(); //upcasting
		f1.eat();
		
		f1= new Strawberry();
		f1.eat();
		
		//Apple a1= new Fruit(); downcasting
	}

}
