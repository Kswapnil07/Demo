package Assignment4;

import java.util.Scanner;

public class DiagonalMatrix {

	void displayArray(int a[][], int r, int c) {

		System.out.println("Element of array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}

	void Diagonalelement(int a[][], int r, int c) {


		int sum = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == j) 
		
				{
					sum = sum + a[i][j];

				}

			}
		}
		System.out.print(" diagonal element of sum:"+sum);
	}

	public static void main(String[] args) {
		
		
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		r = sc.nextInt();
		System.out.println("enter the col");
		c = sc.nextInt();

		int arr[][] = new int[r][c];
		System.out.println("enter " + (r * c) + "element: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		DiagonalMatrix a1 = new DiagonalMatrix();
		a1.displayArray(arr, r, c);
		a1.Diagonalelement(arr, r, c);
	}
}