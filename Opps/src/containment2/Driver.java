package containment2;

public class Driver {
	int did;
	String dname,dcontact;
	Driver(int did,String dname,String dcontact){
		this.did=did;
		this.dname=dname;
		this.dcontact=dcontact;
		
	}
	public String toString() {
		return did+" "+dname+" "+dcontact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
