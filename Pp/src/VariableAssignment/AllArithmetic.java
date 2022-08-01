package VariableAssignment;

import java.util.Scanner;

public class AllArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int add,sub,div,mul;
		System.out.println("enter num");
		int a=sc.nextInt();
		System.out.println("enter num");
		int b=sc.nextInt();
		
		add=a+b;
		sub=a-b;
		div=a/b;
		mul=a*b;
		System.out.println("add num:"+add);
		System.out.println("sub num:"+sub);
		System.out.println("div num:"+div);
		System.out.println("mul num:"+mul);
		
		
	}

}
