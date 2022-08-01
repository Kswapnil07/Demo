package classs;

import java.util.Scanner;

public class SimpleInterest {

	int mul(int p,int r,int t) {
		return p*r*t;
	}
	void Sipmle(int p,int r,int t) {
		double simpleI=mul(p,r,t)/100;
		System.out.println(simpleI);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter p, r,t");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		SimpleInterest s=new SimpleInterest();

		s.Sipmle(p, r, t);	
		
		
	}

}
