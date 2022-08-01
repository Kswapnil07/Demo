package AssignmentInheritance;


public class Driver extends Car {

	int did;
	String dname;
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	

	public String toString() {
		return id+" "+name+" "+modelno+" "+did+" "+dname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver d=new Driver();
		d.setId(1);
		d.setName("swift");
		d.setModelno("2015");
		d.setDid(100);
		d.setDname("ram");
		System.out.println(d);
		
	}

}
