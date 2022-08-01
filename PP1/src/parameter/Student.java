package parameter;

public class Student {

	int id;
	String name;
	
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
//	void display() {
//		System.out.println(id+" "+name);
//	}
	
	public String toString() {
		return id+" "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(101,"raj");
		Student s1=new Student(102," ram");
		//s.display();
		System.out.println(s);
		System.out.println(s1);
		
	}

}
