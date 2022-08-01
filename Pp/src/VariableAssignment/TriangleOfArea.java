package VariableAssignment;

import java.util.Scanner;

public class TriangleOfArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int b=sc.nextInt();
		System.out.println("enter the height");
		int h=sc.nextInt();
		
		int TriangleOfArea=(b*h)/2;
		System.out.println("TriangleOfArea:"+TriangleOfArea);
		
	}

}
