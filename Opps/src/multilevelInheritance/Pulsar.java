package multilevelInheritance;

public class Pulsar extends Bike {
	int weight;
	String modelno,name;
	
	void setPulsorData(int weight,String modelno,String name) {
		this.weight=weight;
		this.modelno=modelno;
		this.name=name;
	}
	void gears() {
		super.gears();
		System.out.println("minimum 5 gears");
	}

}
