package classes;

import java.util.Scanner;

public class simpleinterest {
	
	int mul(int p,int r,int t) {
		return p*r*t;
}
	void simple(int p, int r, int t) {
	double simpleinterest=mul(p,r,t)/100;
	System.out.println(simpleinterest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pricipalamount rate time");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		simpleinterest c1= new simpleinterest();
		c1.simple(p,r,t);
	    sc.close();

}
}