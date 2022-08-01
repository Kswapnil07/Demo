package loopAssignment;

import java.util.Scanner;

public class DigitAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter digit");
		int digit=sc.nextInt();
		int sum=0;
		
		while(digit>0) {
			int d=digit%10;
			sum=sum+d;
			digit=digit/10;
			
		}
		System.out.println(sum);
	} 
}