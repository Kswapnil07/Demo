package constructor;
import java.util.Scanner;
public class Student3 {
int id,marks;
String name,dept,city,contact;

Student3(int id,String name,String dept,String city, String contact,int marks){
this.id=id;
this.name=name;
this.dept=dept;
this.city=city;
this.contact=contact;
this.marks=marks;
}
void grade()
    {
	if(marks>=80)
	{
		System.out.println("first class");
	}
	else if(marks>=60)
	{
		System.out.println("second class");		
	}
	else if(marks>=50) 
	{
		System.out.println("third class");		
	}
	
	else
	{
		System.out.println("fail");
	}
    }

public String toString() {
	return id+" "+name+" "+dept+" "+city+" "+contact+" "+marks;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter id,name,dept,city,contact,marks");
int id=sc.nextInt();
String name=sc.next();
String dept=sc.next();
String city=sc.next();
String contact=sc.next();
int marks=sc.nextInt();

Student3 s1=new Student3( id,name,dept,city,contact,marks);
System.out.println(s1);
s1.grade();
	}

}
