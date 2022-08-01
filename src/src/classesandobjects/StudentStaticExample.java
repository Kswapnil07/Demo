package classesandobjects;

public class StudentStaticExample {
	
	int id,marks;
	String name;
	static String colgname="ABC";
	
	static
	{
		colgname="DYP";
		//marks=80;
		System.out.println("Static block 1"+colgname);
	}
	
	static 
	{
		System.out.println("Static block 2");
	}
	
	StudentStaticExample(int id, String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	static void colgname1()//can access only static directly if non static it requires an object
	{
		StudentStaticExample s1= new StudentStaticExample(101,"Anjali",80);
		colgname="DYPCOE";
		s1.marks=90;
		System.out.println("College name is: "+colgname);
	}
	
	void display()//non static can access both static as well as non static directly
	{
		colgname="DYPCOE";
		marks=90;
		System.out.println(id+" "+name+" "+marks);
	}
	 
	public static void main(String[] args) {
		
		
		StudentStaticExample s1= new StudentStaticExample(101,"Anjali",80);
		
		s1.display();
		System.out.println(StudentStaticExample.colgname);
		System.out.println(colgname);//directly
		System.out.println(s1.marks);
		colgname1();
		
		
		
		/*StudentStaticExample s2= new StudentStaticExample(102,"Rahul",70);
		StudentStaticExample s3= new StudentStaticExample(103,"Pooja",75);
		StudentStaticExample s4= new StudentStaticExample(104,"Nisha",65);*/
	}

}
