package pattern;

import java.util.Scanner;

public class numpattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row number");
		r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
			
			if(j%2==0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
			}
			System.out.println();
	}
	}
}
