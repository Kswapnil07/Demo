package Assignment3;

public class Employee {
 private int id,salary;
 private String name;
 Employee(){}
	Employee(int id,String name,int salary)
	    {
		this.id=id;
		this.name=name;
		this.salary=salary;
	     }
		void setId(int id)
		{
			this.id=id;
		}
		int getid() {
			return id;
		}
		void setName(String name)
		{
			this.name=name;
		}
		String getname()
		{
			return name;
	   }
		void setSalary(int salary) {
		this.salary=salary;
	}
		int getsalary() {
		return salary;
	}

void display() {
	System.out.println("employee details:"+id+" "+name+" "+salary);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee s1=new Employee();
s1.setId(101);
s1.setName("raju");
s1.setSalary(50000);
s1.display();


Employee s2=new Employee(102,"ganesh",30000);
s2.display();
	}

}
