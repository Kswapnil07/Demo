package constructor;

public class StudentStaticExample {
	int id,marks;
	String name;
	static String colgname ="ABC";
	StudentStaticExample(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	static void colgname1() {
		System.out.println("collage name is :"+colgname);
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+marks+" "+colgname);
	}
	public static void main(String[] args) {
		
		StudentStaticExample s1=new StudentStaticExample(101, "raj", 85);
		s1.display();
		
	//	System.out.println(StudentStaticExample.colgname);
		StudentStaticExample.colgname1();

		StudentStaticExample s2=new StudentStaticExample(102, "ram", 85);
		
         s2.display();
         StudentStaticExample.colgname1();
	}

}
