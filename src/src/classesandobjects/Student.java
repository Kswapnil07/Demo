package classesandobjects;

public class Student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		s1.javaCourse();
		s2.pythonCourse();
		s3.frontEndCourse();
	}
	
	void javaCourse()
	{
		System.out.println("J2SE+J2EE");
	}
	
	void pythonCourse()
	{
		System.out.println("Python+DataBase");
	}
	
	void frontEndCourse()
	{
		System.out.println("HTML+Angular+CSS");
	}
	
	void instituteName()
	{
		System.out.println("ThinkQuotient");
	}

	

}
