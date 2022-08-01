package pratics;
import java.util.Scanner;
public class ifelseifexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks");
int m=sc.nextInt();
if(m>=0 && m<=100)
{
	if(m>=80 && m<=100)
		System.out.println("student is passed with A+ grade");
	
	else if(m>=60 && m<=79)
		System.out.println("student is passed with A grade");
	else if (m>=50 && m<=59)
		System.out.println("student is passed with B grade");
	else 
		System.out.println("student is fail");

}
else
	System.out.println("enter the marks are invalid");

	}

}
