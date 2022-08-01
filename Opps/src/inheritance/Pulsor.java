package inheritance;

public class Pulsor extends Bike {

	int weight;
	String modelno,name;
	
	void setPulsorData(int weight,String modelno,String name) {
		this.weight=weight;
		this.modelno=modelno;
		this.name=name;
	}
	public String toString() {
		return weight+" "+modelno+" "+name+" d"+price+" " +colour+" "+model+" "+milage;
	}
	void engine() {
		System.out.println("220 cc");
	}
	
}
