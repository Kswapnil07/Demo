package AssignmentInheritance;

import java.util.Arrays;

public class Person {

	int id;
	String dname,contact,address;
	IdProof Ip[];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDname(String dname) {
		
		this.dname=dname;
	}
	public String getDname() {
		return dname;
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
	public IdProof[] getIp() {
		return Ip;
	}
	public void setIp(IdProof[] ip) {
		Ip = ip;
	}
	public String toString() {
		return id+" "+dname+" "+contact+" "+address+" "+Arrays. toString(Ip);
	}
	
}
