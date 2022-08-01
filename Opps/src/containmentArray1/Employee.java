package containmentArray1;

public class Employee {

	int id,salary;
	String dname,ddept,contact,address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDdept() {
		return ddept;
	}
	public void setDdept(String ddept) {
		this.ddept = ddept;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return id+" "+salary+" "+dname+" "+ddept+" "+contact+" "+address;
	}
}
