package Default;

public class Student1 {

	int id,marks;
	String name;
	Student1(){}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return id+" "+marks+" "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s=new Student1();
		s.setId(101);
		s.setMarks(85);
		s.setName("ram");
		System.out.println(s);
		
	}

}
