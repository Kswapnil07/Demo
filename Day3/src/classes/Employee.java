package classes;

import java.util.Scanner;

public class Employee {
int id,salary;
String name,dept,designation,rating;
void employeeData(int i,String n,String d, String de,String r, int s) {
	id=i;
	name=n;
	dept=d;
	designation=de;
	rating=r;
	salary=s;
}
/*void display() {
	System.out.println(id+" "+name+" "+dept+" "+designation+" "+rating+" "+salary);
}*/
void bonusEmp() {
	if (rating.equals("A")){
		salary=salary*15/100+salary;
		System.out.println("add salary with bonous: "+salary);
	}
	else if (rating.equals("B")) {
		salary=salary*10/100+salary;
		System.out.println("add salary with bonous: "+salary);
	}		
	else if (rating.equals("C")) {
		salary=salary*5/100+salary;
		System.out.println("add salary with bonous: "+salary);
	}
	else if (rating.equals("no Bonus")) {
	
		System.out.println("add salary with bonous: "+salary);
	}		
}
public String toString() {
	
	return id+" "+name+" "+dept+" "+designation+" "+rating+" "+salary;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Employee s1 =new Employee();//
//Employee s2= new Employee();//
//Employee s3= new Employee();
		int id,salary;
		String name,dept,designation,rating;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the employee id,name,dept,designation,rating,salary: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
        salary=sc.nextInt();
        
        Employee s1=new Employee();
        s1.employeeData(id,name,dept,designation,rating,salary);
        
        
        
        Employee s2=new Employee();
        System.out.println("enter the employee id,name,dept,designation,rating,salary: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
        salary=sc.nextInt();
        s2.employeeData(id,name,dept,designation,rating,salary);
        
        Employee s3=new Employee();
        System.out.println("enter the employee id,name,dept,designation,rating,salary: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
        salary=sc.nextInt();
        s3.employeeData(id,name,dept,designation,rating,salary);
        
        System.out.println(s1);
        s1.bonusEmp();
        
        System.out.println(s2);
        s2.bonusEmp();
        
        System.out.println(s3);
        s3.bonusEmp();
        
        
/*s1.employeeData(1,"ramesh","Ele","enginer", "A",60000);
s1.display();
s1.bonusEmp();
System.out.println();

s2.employeeData(2,"raju","com","enginer", "B",70000);
s2.display();
s2.bonusEmp();
System.out.println();

s3.employeeData(3 , "Ram" , "civil" ,"enginer","C",50000);
s3.display();
s3.bonusEmp();
System.out.println();*/
	}

}
