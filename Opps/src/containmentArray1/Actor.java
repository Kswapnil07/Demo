package containmentArray1;

public class Actor {

	int did,birthyear;
	String dname,address;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did=did;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return did+" "+birthyear+" "+dname+" "+address;
	}
}
