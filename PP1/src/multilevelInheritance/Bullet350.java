package multilevelInheritance;

public class Bullet350 extends Bullet {

	int speed;
	String engine;
	
	void bullet350Data(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
	}
	
	void display() {
		
		System.out.println(price+" "+color+" "+model+" "+year+" "+name+" "+speed+" "+engine);
	}
	void wheelno() {
		System.out.println("2 wheel");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
