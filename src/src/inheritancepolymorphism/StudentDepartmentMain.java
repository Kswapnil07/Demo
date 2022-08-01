package inheritancepolymorphism;
import java.util.Arrays;
import java.util.Scanner;
public class StudentDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		Department dept[]= new Department[2]; //3
		 
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter id, name,student list: of the "+(i+1)+" department: ");
			int did= sc.nextInt();
			String dname= sc.next();
			Student stud[]= new Student[3];//5
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the id,name,marks,contact of the "+(j+1)+" student:  ");
				int id=sc.nextInt();
				String name=sc.next();
				int marks= sc.nextInt();
				String contact=sc.next();
				
				//Student s1= 
				stud[j]= new Student(id,name,marks,contact);	
			}
			dept[i]= new Department(did,dname,stud);
		}
		
		System.out.println(Arrays.toString(dept));
		
		for(Department d: dept)
		{
			for(Student s:d.stud)
			{
				if(s.marks>60)
				{
					System.out.println(d.name+" "+s.name+" "+s.marks);
				}
			}
		}
		
		
		sc.close();

	}

}
