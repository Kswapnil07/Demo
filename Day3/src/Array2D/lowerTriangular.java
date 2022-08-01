package Array2D;

import java.util.Scanner;

public class lowerTriangular {

	void displayArray(int a[][], int r, int c) {

		System.out.println("Element of array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}

	int sum = 0;

	void triangularElement(int a[][], int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (i > j) {
					sum = sum + a[i][j];
				}

			}
		}
		System.out.println("sum of lower triangular element:" + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		r = sc.nextInt();
		System.out.println("enter the col");
		c = sc.nextInt();

		int arr[][] = new int[r][c];
		System.out.println("enter " + (r * c) + "element");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		lowerTriangular a1 = new lowerTriangular();
		a1.displayArray(arr, r, c);
		a1.triangularElement(arr, r, c);

	}

}
