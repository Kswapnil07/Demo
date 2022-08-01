package AssignmentComparatorHashMap;

public class Employee implements Comparable<Employee>{

	int id ,salary;
	String name,dept;
	Profile p;
	
	Employee(int id,String name,String dept,int salary,Profile p)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.p=p;	
	}
	public String toString() {
		return id+" "+name+" "+dept+" "+salary+p;
	}
	public int compareTo(Employee e)
	{
		
		if(this.p.country.equals(e.p.country))
		{
			return this.p.state.compareTo(e.p.state);
			
		}
		else
			return this.p.country.compareTo(e.p.country);
		
		
		
		
		
		
		
		
//		if(this.name.equals(e.name))
//		{
//			if(this.id>e.id)
//				return 1;
//			else if(this.id<e.id)
//			return -1;
//			
//		}
//		else
//			return this.name.compareTo(e.name);
//		return 0;
//		
		
	}	
}
