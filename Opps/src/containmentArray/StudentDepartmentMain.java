package containmentArray;
import java.util.Arrays;
import java.util.Scanner;
public class StudentDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[3];
		for(int i=0;i<3;i++)
		{
		System.out.println("enter id,name,student list:of the"+(i+1)+" department:");
		int did=sc.nextInt();
		String dname=sc.next();
		
		Student stud[]=new Student[5];
		for(int j=0;j<5;j++)
		{
		System.out.println("enter the id, marks, name, contact of the "+(j+1)+"student");
		int id=sc.nextInt();
		int marks=sc.nextInt();
		String name=sc.next();
		String contact=sc.next();
		
		stud[j]=new Student( id, marks, name, contact);
		
		}
		dept[i]=new Department(did,dname,stud);
		}
		System.out.println(Arrays.toString(dept));
		
		for(Department d:dept) {
			for(Student s:d.stud) {
				if(s.marks>60) {
					System.out.println(d.dname+" "+s.name+" "+s.marks);
				}
			}
		}
		sc.close();
	}
}
			
