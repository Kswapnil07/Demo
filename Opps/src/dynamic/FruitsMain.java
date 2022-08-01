package dynamic;

class Fruits{
	void eat() {
		System.out.println("fruits are good for health");
	}
}
class Apple extends Fruits{
	void eat() {
		System.out.println("Apple arevery good for eyes");
	}
}
class Strawbery extends Fruits{
	void eat() {
		System.out.println("Strawbery are sweet in taste");
	}
	
}
public class FruitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//dynamic method dispatch
//		Apple a1=new Apple();
//		a1.eat();
		
		Fruits f1=new Fruits();
		f1.eat();
		
		f1=new Apple();//up casting
		f1.eat();
		
		f1=new Strawbery();
		f1.eat();
	}

}
