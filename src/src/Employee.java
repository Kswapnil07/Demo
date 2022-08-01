
public class Employee {
	
	int id,salary;
	String firstname, lastname, dept,design;
	
	Employee(){}
	
	void setId(int id)
	{
		this.id=id;
	}
	
	int getId()
	{
		return id;
	}
	
	void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	
	String getFirstName()
	{
		return firstname;
	}
	
	public String toString()
	{
		return id+" "+firstname+" "+lastname+" "+dept+" "+design+" "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		e1.setId(101);
		e1.setFirstName("Anjali");
		
		System.out.println(e1);

	}

}
