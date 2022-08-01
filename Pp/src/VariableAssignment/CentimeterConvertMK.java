package VariableAssignment;

import java.util.Scanner;

public class CentimeterConvertMK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter length centimeter ");
		float c=sc.nextFloat();
		
		float meter=(c/100);
		float kilometer=(c/100000);
		System.out.println(meter);
		System.out.println(kilometer);
	}

}
