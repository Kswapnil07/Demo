package constructor;

public class student11 {
	int id,marks;
	String name,dept,sports;
static String colgname; {
	id=00;
	marks=52;
	name="name";//instance block ,method,constructor
	dept="dept";
	sports="kjcoemr";
	System.out.println("in instance block1");
}
{
	System.out.println("instace block2");
}
student11(){
	System.out.println("in default constructor");
}
//void display() {
//	System.out.println(id+" "+marks+" "+name+" "+dept);
//}

public String toString() {
	{
		return id+" "+name+" "+dept+" "+marks+" "+sports;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student11 s1=new student11();
System.out.println(s1);
System.out.println();
	}}
