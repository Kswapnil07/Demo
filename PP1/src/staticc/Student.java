package staticc;

public class Student {

	int id;
	String name;
	static String college= "ABC";
	
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	static void college1() {
		System.out.println("college name is:"+college);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(101,"raj");
		s.display();
		Student.college1();
	}

}
