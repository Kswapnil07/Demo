package loopAssignment;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int oddsum=0;
		System.out.println("enter the num");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				
				oddsum=oddsum+i;
				
			}
		}
		System.out.println("sum of odd num: "+oddsum);
		
	}

}
