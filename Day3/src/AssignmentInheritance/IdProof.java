package AssignmentInheritance;

public class IdProof {

	int number ;
	String name,validity;
	
	public void setNumber(int number) {
		this.number=number;
		
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setValidity(String validity) {
		this.validity=validity;
		
	}
	public String getValidity() {
		return validity;
	}
	public String toString() {
		return number+" "+name+" "+validity;
	}
}
