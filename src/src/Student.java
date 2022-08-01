
public class Student {
	
	int id,marks;//default values 0,null,0.0
	String name;
	
	/*Student()
	{
		id=-1;
		marks=-1;
		name="000";
	}*/
	
	Student(){}
	
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	
	public String toString()
	{
		return id+" "+name+" "+marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();  //constructor
		System.out.println(s1);
		int id=101;
		
		Student s2= new Student(id,"Riya",70);
		System.out.println(s2);
		
		s2.marks=80; //not recommended
		//s2.setData();
		
		//int id=0;
		//System.out.println(id);

	}

}
