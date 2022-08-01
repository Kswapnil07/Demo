package inheritance;

public class Person {

	String name,contact,address,gender;
	
//	void setData(String name,String contact,String address,String gender) {
//		this.name=name;
//		this.contact=contact;
//		this.address=address;
//		this.gender=gender;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		return name+" "+contact+" "+address+" "+gender;
	}

}
