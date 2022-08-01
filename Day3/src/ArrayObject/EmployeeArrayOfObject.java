package ArrayObject;

import java.util.Scanner;

public class EmployeeArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee stud[]=new Employee[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter" +(i+1)+ "Employee details:");
			System.out.println("id");
			int id=sc.nextInt();
			System.out.println("name");
			String name=sc.next();
			System.out.println("dept");
			String dept=sc.next();
			System.out.println("location");
			String location=sc.next();
			System.out.println("salary");
			int salary=sc.nextInt();	
			
			Employee s=new Employee();
			
		    s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setLocation(location);
			s.setSalary(salary);
			
		   stud[i]=s;
		   
		}
		for(Employee n:stud) 
			
		if(n.getdept().equals("hr") && n.getsalary()>=30000)
		
			System.out.println(n);
		 

	}

}
