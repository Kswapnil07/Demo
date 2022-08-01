package containment2;


public class Car {

	int id;
	String name,brand;
	Driver d;
	Car(int id,String name,String brand,int did,String dname,String dcontact){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.d=new Driver(did,dname,dcontact);
	}

	public String toString() {
		return id+" "+name+" "+brand+" "+d;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
