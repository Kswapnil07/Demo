	package com.basic;
	import java.util.Scanner;
	public class oddnumber {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	switch (num%2)
	{
	case 0: System.out.println("even number") ;
	break;
	default:
		System.out.println("odd number");
		}
		}
	    }
