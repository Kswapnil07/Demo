package Default;

public class Student {

	int id;
	String name;
	
	Student()
	{
		id=101;
		name="ram";
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
//		s.id=101;
//		s.name="ram";
		
		s.display();
	}

}
