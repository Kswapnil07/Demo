package loopAssignment;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter num");
		int num=sc.nextInt();
		int product=1;
		while(num>0) {
			
			int p=num%10;
			product=product*p;
			num=num/10;
		}
		System.out.println(product);
		
		
		
		
	}

}
