package practics;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num > 0) {
			int r = num % 10;
			product = product * r;
			num = num / 10;
		}
		System.out.println(product);
	}

}
