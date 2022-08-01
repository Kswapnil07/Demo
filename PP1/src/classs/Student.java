package classs;

public class Student {
	
	int id,marks;
	String name;
	
	void studentDetails(int i,int m,String n)
	{
		id=i;
		marks=m;
		name=n;
	}
//	void showDetails()
//	{
//		System.out.println(id);
//		System.out.println(marks);
//		System.out.println(name);
//	}

	void display()
	{
		System.out.println( id+" "+marks+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.studentDetails(101, 85, "ram");
		//s.showDetails();
		s.display();
	}

}
