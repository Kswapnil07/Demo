package com.basic;
import java.util.Scanner;
public class SwitchDemo3 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter day");
		int Choice =Sc.nextInt();
		switch(Choice)  
		{
		case 1: System.out.println("sunday");
		break;
		case 2: System.out.println("monday");
		break;
		case 3: System.out.println("tuesday");
		break;
		case 4: System.out.println("wednesday");
		break;
		case 5: System.out.println("thursday");
		break;
		case 6: System.out.println("fridsy");
		break;
		case 7: System.out.println("saturday");
		break;
		default:
			System.out.println("invoild choice");
		}
		
		// TODO Auto-generated method stub

	}

}
