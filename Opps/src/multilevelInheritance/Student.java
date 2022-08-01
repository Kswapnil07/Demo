package multilevelInheritance;

public class Student extends Person {
	int id,percent;
	String dept;
	
	void setDataStudent(int id,int percent,String dept) {
		this.id=id;
		this.percent=percent;
		this.dept=dept;
	}
	void grade() {
		if(percent>80) {
			System.out.println("A+");
		}
		else if(percent>60) {
			System.out.println("A");
			
		}
		else if(percent>50) {
			System.out.println("B");
		}
		else {
			System.out.println("fail");
		}
		
		
	}
	void display() {
		System.out.println(name+" "+contact+" "+address+" "+id+ " "+percent+" "+dept);
	}

}
