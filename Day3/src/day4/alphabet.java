package day4;
import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int r;
		char ch;
		r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			 
			for(int j=1;j<=i;j++) {
				System.out.print((char)(i+64));
				
			}
			System.out.println("");
		}
System.out.println("done");
	}

}
