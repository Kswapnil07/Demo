package constructor;

public class Student {
int id,marks;
String name;
//Student()
//{
//	id=101;
//	marks=70;
//	name="raju";
//}
Student (int id,int marks,String name){
	this.id=id;
	this.marks=marks;
	this.name=name;
}
public String toString() {
	return id+" "+marks+" "+name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Student s1=new Student();
//System.out.println(s1);

Student s2=new Student(7,80,"ram");
System.out.println(s2);
	}

}
