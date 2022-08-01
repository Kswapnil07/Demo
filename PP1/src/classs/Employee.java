package classs;

public class Employee {

	int id,salary;
	String name,dept,rating;
	
	void employeeDetails(int i,int s,String n,String d,String r)
	{
		id=i;
		salary=s;
		name=n;
		dept=d;
		rating=r;
	}
	
	void bonous()
	{
		if(rating.equals("A")) {
			salary=salary*15/100+salary;
			System.out.println(salary);
		}
		else if(rating.equals("B"))
		{
			salary=salary*10/100+salary;
			System.out.println(salary);
		}
	}
	
	void display() {
		System.out.println(id+" "+salary+" "+name+" "+dept+" "+rating);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.employeeDetails(101, 50000, "ram", " dept", "B");
		e.bonous();
		e.display();
	}

}
