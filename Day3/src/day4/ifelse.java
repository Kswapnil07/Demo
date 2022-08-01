package day4;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		if(num>0)
			System.out.println("number is positive");
			else
				System.out.println("number is negative");

	}

}
