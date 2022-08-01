package constructor;
import java.util.Scanner;
public class student1 {
int id,marks;
String name,dept,city,contact;

student1(int id,String name,String dept,String city, String contact,int marks){
	
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.city=city;
	this.contact=contact;
	this.marks=marks;
	
}

	
public String toString() {
	return id+" "+name+" "+dept+" "+city+" "+contact+" "+marks;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

student1 s1=new student1( 101,"raju","ele","pune", "77466568567",75);
System.out.println(s1);
	}
	}


