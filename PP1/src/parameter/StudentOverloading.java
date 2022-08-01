 package parameter;

public class StudentOverloading {

	int id;
	String name;
	int age;
	
	StudentOverloading(int i,String n)
	{
		id=i;
		name=n;
	}
	
	StudentOverloading(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentOverloading s1=new StudentOverloading(101,"karan");
		StudentOverloading s2=new StudentOverloading(102,"aryan",25);
		s1.display();
		s2.display();
	}

}
