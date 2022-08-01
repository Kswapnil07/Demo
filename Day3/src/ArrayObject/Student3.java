package ArrayObject;

public class Student3 {

	int id,marks;
	String name;
	Student3(int id,int marks,String name){
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	public String toString () {
		return id+" "+marks+" "+name;
	}
}
