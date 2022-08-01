package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
	static void add(int a, int b) {
		System.out.println("addition is:" + (a + b));
	}

	static void division(int a, int b) {
		System.out.println("dicision is process");
		System.out.println("division is:" + (a / b));
	}

	static void arrayElement(int arr[], int i) {
		System.out.println("element at the index:" + arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("enter 2 number");
		int a = 0;
		int b = 0;

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			division(a, b);
			arrayElement(arr, 5);
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException |InputMismatchException e) {
			System.out.println(e);
			//e.printStackTrace();

		}

		add(a, b);
		//arrayElement(arr, 7);
	}

}
