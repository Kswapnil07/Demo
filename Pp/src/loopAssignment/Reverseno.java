package loopAssignment;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		int reverse=0;
		while(num>0) {
			int r=num%10;
		 reverse=reverse*10+r;
			num=num/10;
		}
		 System.out.println(reverse);

	}

}
