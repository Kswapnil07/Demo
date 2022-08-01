package pratics;
import java.util.Scanner;
public class accountholder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the acc holder age");
int age=sc.nextInt();
if(age>=18)
	System.out.println("allow the person open acc");
else
	System.out.println("not allow person open acc");

	}

}
