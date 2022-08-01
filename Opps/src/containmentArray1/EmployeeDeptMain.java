package containmentArray1;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[2];
		
		for(int i=0;i<2;i++) {
			System.out.println("enter totalemp,name employee list:of the" +(i+1)+"department");
			int totalempl=sc.nextInt();
			String name=sc.next();
			Employee empl[]=new Employee[2];
			
			for(int j=0;j<2;j++) {
				System.out.println(" enter id,salary,name,dept,contact,address of the:"+(j+1)+"employee");
				
				int id=sc.nextInt();
				int salary=sc.nextInt();
				String dname=sc.next();
				String ddept=sc.next();
				String contact=sc.next();
				String address=sc.next();
				
				Employee e1=new Employee();
				e1.setId(id);
				e1.setSalary(salary);
				e1.setDname(dname);
				e1.setDdept(ddept);
				e1.setContact(contact);
				e1.setAddress(address);
				empl[j]=e1;
				
			}
			Department d1=new Department();
			d1.setTotalemp(totalempl);
			d1.setName(name);
			d1.setEmpl(empl);
			dept[i]=d1; 
		}
		System.out.println(Arrays.toString(dept));
//		for(Department d:dept)
//		{
//			for(Employee e:d.empl)
//			{
//				if(e.getAddress().equals("pune")&& e.getSalary()>30000)
//				{
//					System.out.println(d.name+" "+e.id+" "+e.dname+" "+e.salary);
//				}
//			}
//		}
		for(Department d:dept)
		{
			
		for(Employee e:d.empl)
		{
			int a=0;
			if(e.getSalary()>50000)
			{
				a=e.getSalary()*15/100;
				System.out.println(d.name+" "+e.id+" "+e.address+" "+e.salary+" "+a);
				}
		}
		}
		sc.close();
	}
}
