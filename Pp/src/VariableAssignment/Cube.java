package VariableAssignment;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int cube=num*num*num;
		//int cube= (int) Math.pow(num, 3);
		System.out.println(cube);
	}

}
