package assignmentArrayList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		LinkedList<Emp> e=new LinkedList<Emp>();
		
		System.out.println("enter id name dept");
		
		for(int i=0;i<5;i++)
		{
			
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			e.add(new Emp(id,name,dept));
		}
		
		System.out.println(e);
		
		String dep="";
		
		
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).id==10) 
			{
				dep=e.get(i).dept;
			}
		}
		ListIterator<Emp> le=e.listIterator();
		
		while(le.hasNext())
		{
			if(le.next().dept.equalsIgnoreCase(dep))
			{
				le.remove();
			}
			
		}
		
		System.out.println(e);
				
	}

}
