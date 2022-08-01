package aggergation;

public class Employee {

	int id;
	String name;
	Address a;
	Employee(int id,String name,Address a)
	{
		this.id=id;
		this.name=name;
		this.a=a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Address a=new Address("dfthr","fyf");
		a.display();
		Employee e=new Employee(101,"sres",a);
		e.display();
	}

}
