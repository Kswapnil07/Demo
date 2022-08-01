package containmentArray;
import java.util.Arrays;
import java.util.Scanner;
public class StudentDepartmentmain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Department1 dept[]=new Department1[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter id,name,student list:of the"+(i+1)+" department:");
			int did=sc.nextInt();
			String dname=sc.next();
			Student1 stud[]=new Student1[2];
			for(int j=0;j<2;j++)
			{
			System.out.println("enter the id, marks, name, contact of the "+(j+1)+"student");
			int id=sc.nextInt();
			int marks=sc.nextInt();
			String name=sc.next();
			String contact=sc.next();
			
			Student1 s1=new Student1();
			s1.setId(id);
			s1.setMarks(marks);
			s1.setName(name);
			s1.setContact(contact);
			stud[j]=s1;
			
			}
			Department1 d1=new Department1();
			d1.setDid(did);
			d1.setDname(dname);
			dept[i]=d1; 
			d1.setStud(stud);
		}	
		System.out.println(Arrays.toString(dept));
		
		for(Department1 d:dept) {
			for(Student1 s:d.stud) {
				if(s.marks>60) {
					System.out.println(d.dname+" "+s.name+" "+s.marks);
				}
			}
		}
		sc.close();
	}
		}
