package Assignment2;
import java.util.Scanner;
public class student {
int id,m1,m2,m3,marks,percentage;
String name,dept;
void data(int i,String n, int x, int y, int z,String d) {
	        id=i;
			name=n;
			m1=x;
			m2=y;
			m3=z;
			dept=d;
			
	
}
void marks() {
	marks=m1+m2+m3;
	System.out.println("marks="+marks);
}
void percentage() {
	percentage=marks*100/300;
	System.out.println("percentage="+percentage+"%");
	
}
void result() {
	if(percentage>=80) {
		System.out.println("first class");
	}
	else if(percentage>=65) {
		System.out.println("second class");
	}
	else if(percentage>=50) {
		System.out.println("third class");
	}
	else {
		System.out.println("fail");
	}
}
public String toString() {
	return id+" "+name+" "+m1+" "+m2+" "+m3+" "+dept;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int id,m1,m2,m3;
String name,dept;
Scanner sc=new Scanner(System.in);
student s1=new student();
System.out.println("enter id, name, m1, m2, m3, dept");
id=sc.nextInt();
name=sc.next();
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
dept=sc.next();
s1.data(id, name, m1, m2, m3,dept);

s1.marks();
s1.percentage();
s1.result();
System.out.println(s1);
student s2=new student();
System.out.println("enter id, name, m1, m2, m3, dept");
id=sc.nextInt();
name=sc.next();
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
dept=sc.next();
s2.data(id, name, m1, m2, m3,dept);

s2.marks();
s2.percentage();
s2.result();
System.out.println(s2);

	}

}
