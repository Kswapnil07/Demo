package containment;

public class Driver1 {

	int id;
	String name,contact;
	
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setContact(String contact) {
		this.contact=contact;
	}
	String getContact() {
		return contact;
	}
	public String toString () {
		return id+" "+name+" "+contact;
	}
}
