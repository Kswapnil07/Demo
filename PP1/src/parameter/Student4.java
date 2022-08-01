package parameter;

public class Student4 {  //copy value without constructor

	int id;
	String name;
	
	Student4(int i,String n)
	{
		id=i;
		name=n;
	}
	Student4(){}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student4 s=new Student4(101,"fwr");
		Student4 s1=new Student4();
		s1.id=s.id;
		s1.name=s.name;
		s1.display();
		s.display();
	}

}
