package arraysinjava;

import java.util.Scanner;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//   datatype arrname[]= new datatype[size];
		
	/*	Student s1= new Student(101,"Anjali","Computer",70);
		Student s2= new Student(102,"Raj","Mechanical",65);*/
		
		Student stud[]= new Student[5];
		
		//stud[0]=s1;
		
		/*stud[0]= new Student(101,"Anjali","Computer",70); //annonymous object 
		stud[1]= new Student(102,"Raj","Mechanical",65);
		stud[2]= new Student(103,"Riya","Civil",60);
		stud[3]= new Student(104,"Amol","ENTC",75);
		stud[4]= new Student(105,"Nisha","Computer",60);*/
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter "+(i+1)+" Student details: ");
			System.out.println("Enter the id: ");
			int id= sc.nextInt();
			System.out.println("Enter the name: ");
			String name= sc.next();
			System.out.println("Enter the department: ");
			String dept= sc.next();
			System.out.println("Enter the marks; ");
			int marks= sc.nextInt();
			
			//Student s= new Student();
			//s.setId(id);
			
			//stud[i]=s;
			
			stud[i]= new Student(id,name,dept,marks);
			
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(stud[i]);
		}
		
		//for Each loop traversing group of elements
		for(Student s:stud)//s=stud[1] //map the array with its type of variable
		{
			//if(s.name.startsWith("R"))
			System.out.println(s);
		}

	}

}
