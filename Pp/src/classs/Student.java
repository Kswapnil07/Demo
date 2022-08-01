package classs;

public class Student {

	int id;
	String name,contact;
	void setData(int i,String n,String c) {
		id=i;
		name=n;
		contact=c;
	}
	void Showdetails()
	{
		System.out.println("enter student id:"+id);
		System.out.println("enter student name:"+name);
		System.out.println("enter student contact:"+contact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.setData(101, "swapnil", "7768949523");
		s1.Showdetails();
		
		
	}

}
