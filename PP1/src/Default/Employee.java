package Default;

public class Employee {

	int id,salary;
	String name,dept;
	
	Employee(){}
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}
	String getDept() {
		return dept;
	}
	
	public String toString() {
		return id+" "+salary+" "+name+" "+dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.setId(101);
		e.setSalary(50000);
		e.setDept("ele");
		e.setName("ftfyt");
		System.out.println(e);
		
	}

}
