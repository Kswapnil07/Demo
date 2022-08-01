package parameter;

public class Student1 {

	int id,marks;
	String name;
	
	Student1(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	public String toString() {
		return id+" "+marks+" "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s=new Student1(101,55,"ram");
		System.out.println(s);
		
				
	}

}
