package multilevelInheritance;

public class PulsorRs extends Pulsar {

	int speed;
	String engine;
	
	void setPulsorRsdata(int speed,String engine) {
		this.speed=speed;
		this.engine=engine;
	}
	public String toString() {
		return weight+" "+modelno+" "+name+" "+price+" " +colour+" "+model+" "+milage+" "+speed+" "+engine;
	}
	
	void gears() {
		super.gears();
		System.out.println("minimum 6 gears");
	}
	
}
