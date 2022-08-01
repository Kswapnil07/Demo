package containment;

public class Car1 {

	int id;
	String name,brand;
	Driver1 d;
	
	void setId(int id) {
		this.id=id;
	}
	int getid() {
		return id;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	String getBrand() {
		return brand;	
	}
	void setD(Driver1 d) {
		this.d=d;
	}
	Driver1 getd() {
		return d;
	}
	
	public String toString() {
		return id+" "+name+" "+brand+" "+d;
	}
	
	
	}
