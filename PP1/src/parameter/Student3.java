package parameter;

public class Student3 {

	
	int id;
	String name;
	Student3(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student3(Student3 s) //copy value one object into another 
	{
		id=s.id;
		name=s.name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 s1=new Student3(101,"ram");
		Student3 s2=new Student3(s1);
		s1.display();
		s2.display();
		
	}

}
