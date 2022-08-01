package assignment5;

public class Department {

	int id;
	String name;
	
	Department(int id,String name) {
		this.id=id;
		this.name=name;
	}
		public String toString() {
		return id+" "+name;	
	}

}
