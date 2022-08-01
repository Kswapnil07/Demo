package constructor;

public class Employee {
int id,salary;
String firstname,lastname,dept,design;
Employee(){}

void setId(int id) {
	this.id=id;
}
int getid() {
	return id;
}
void setFirstname(String firstname) {
	this.firstname=firstname;
}
String getfirstname() {
	return firstname;
}
void setLasttname(String lastname) {
	this.lastname=lastname;
}
String getlastname() {
	return lastname;
}
void setDept(String dept) {
	this.dept=dept;
}
String getdept() {
	return dept;
}
void setDesign(String design) {
	this.design=design;
}
String getdesign() {
	return design;
}
void setSalary(int salary) {
	this.salary=salary;
}
int getsalary() {
	return salary;
}

public String toString () {
	return id+" "+firstname+" "+lastname+" "+dept+" "+design+" "+salary;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();

e1.setId(1);
e1.setFirstname("ram");
e1.setLasttname("kaa");
e1.setDept("ele");
e1.setDesign("engineer");
e1.setSalary(1000);

System.out.println(e1);
	}

}
