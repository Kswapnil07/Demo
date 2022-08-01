package inheritance;

public class Pulsor extends Bike {
	
	
	int weight;
	String name;
	
	void pulsorData(int weight,String name) {
		
		this.weight=weight;
		this.name=name;
		
	}
	void display() {
		System.out.println(price+" "+color+" "+model+" "+weight+ " "+name);
	}
	void engine() {
		System.out.println("engine is 220cc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pulsor p=new Pulsor();
		p.bikeData(125000, "black", "2020");
		p.pulsorData(220, "pulsor220");
		p.display();
		p.wheel();
		p.engine();
	
		
	}

}
