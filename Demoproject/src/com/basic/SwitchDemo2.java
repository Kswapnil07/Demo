package com.basic;
import java.util.Scanner;
public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your choice");
		String input=Sc.next();
		switch (input)
		{
		case "happy":System.out.println("happy");
		break;
		case "new":System.out.println("new");
		break;
		case "year":System.out.println("year");
		
		default:System.out.println("welcome");
		}

	}

}
