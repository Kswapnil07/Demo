package classes;

public class student1 {
	int id,marks;
	String name,dept,sports;
void studentData(int i,String n,String d,int m,String s ) {
	id=i;
	marks=m;
	name=n;
	dept=d;
	sports=s;
}
void display() {
	System.out.println(id+" "+marks+" "+name+" "+dept);
}
void sportsMarks() {
	if (sports.equals("Badminton")) {
		marks=marks+5;
		System.out.println("new marks are: "+marks);
	}
	else if (sports.equals("hocky")) {
		marks=marks+3;
		System.out.println("new marks are: "+marks);
	}		
	else if (sports.equals("khokho")) {
		marks=marks+2;
		System.out.println("new marks are: "+marks);
	}
	else if (sports.equals("no")) {
	
		System.out.println("new marks are: "+marks);
	}		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 s1=new student1();
student1 s2=new student1();
student1  s3=new student1();
s1.studentData(101 , "Raj" , "Com" , 70,"Badminton");
		s1.display();
		s1.sportsMarks();
		System.out.println();
		
		s2.studentData(102 , "Riya" , "Entc" , 69,"hocky");
		s2.display();
		s2.sportsMarks();
	System.out.println();
		
		s3.studentData(102 , "Ramesh" , "Ele" , 69,"khokho");
		s3.display();
	s3.sportsMarks();
		System.out.println();
	}

}
