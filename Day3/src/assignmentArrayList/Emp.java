package assignmentArrayList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Emp {

	int id;
	String name,dept;
	
	Emp(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString() {
		return id+" "+name+" "+dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LinkedList<Emp> e=new LinkedList<Emp>();
		
		System.out.println("enter id name dept");
		
		for(int i=0;i<3;i++)
		{
			
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			e.add(new Emp(id,name,dept));
		}
		
		System.out.println(e);
		
		String dept="";
		
		
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).id==10) 
			{
				dept=e.get(i).dept;
			}
		}
		ListIterator<Emp> k=e.listIterator();
		
		while(k.hasNext())
		{
			Emp l=k.next();
			if(k.next().dept.equalsIgnoreCase(dept))
			{
				k.remove();
			}
			
		}
		
		System.out.println(e);
				
	}

}
