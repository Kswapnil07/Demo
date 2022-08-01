package AssignmentComparatorHashMap;

public class Student {

	int rollno,age;
	String name;
	Student(int rollno,int age,String name)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString () {
		return rollno+" "+age+" "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
