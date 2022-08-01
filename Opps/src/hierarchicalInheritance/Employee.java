package hierarchicalInheritance;


public class Employee extends Student {

	int id,salary;
	String dept;
	float pf;
	void setDataEmployee(int id,int salary,String dept) {
		this.id=id;
		this.salary=salary;
		this.dept=dept;
	}
	void pf() {
		pf=salary*15/100;
		System.out.println("pf:" +pf);
		}
	void display() {
		super.display();
		System.out.println(id+" "+salary+" "+dept+" "+pf);
	}
}
