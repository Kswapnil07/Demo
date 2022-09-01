package fact;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your plan name");
		String name=sc.next();
		
		System.out.println("Enter the Units");
		int unit=sc.nextInt();
		
		PlanInput pi=new PlanInput();
		Plan p=pi.getPlan(name);
		
		p.getRate();
		p.generateBill(unit);
		
		
	}

}
