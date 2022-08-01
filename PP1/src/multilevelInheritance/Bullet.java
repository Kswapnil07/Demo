package multilevelInheritance;

public class Bullet extends Bike {
	
	int year;
	String name;
	void bulletData(int year,String name) {
		
		this.year=year;
		this.name=name;
	}
	
	void gears() {
		System.out.println("minimum 5 gears");
	}

}
