package constructor;

public class StudentStaticExample1 {
int id,marks;
String name;
static String colgname="KJCOEMR";
StudentStaticExample1(int id,String name,int marks){
	this.id=id;
	this.name=name;
	this.marks=marks;
	
}
static void colgname1()//can access only static directly if non static it requires an object
{
	StudentStaticExample1 s1= new StudentStaticExample1(101,"ram",80);
	colgname="KJCOEMR";
	s1.marks=90;
	System.out.println("college name is:"+colgname);
	
}
void display()//non static can access both static as well as non static directly
{
	colgname="KJCOEMR";
	marks=90;
	System.out.println(id+" "+name+" "+marks);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStaticExample1 s1=new StudentStaticExample1(101,"ram",80);
		s1.display();
		System.out.println(StudentStaticExample1.colgname);
		System.out.println(colgname);
		System.out.println(s1.marks);
	}

}
