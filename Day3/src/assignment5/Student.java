package assignment5;

public class Student {
	
	
	int roll;
	String Sname;
	Department d;
	
	Student(int roll,String Sname,Department d){
		this.roll=roll;
		this.Sname=Sname;
		this.d=d;
	}

	public String toString() {
		return roll+" "+Sname+" "+d;
	}
}
