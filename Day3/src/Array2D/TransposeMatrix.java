package Array2D;

import java.util.Scanner;

public class TransposeMatrix {

	void displayArray(int a[][], int r, int c) {
		System.out.println("Element of array are: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	void TransElement(int a[][], int r, int c) {
		
		System.out.println("Transpose matrix");
		
		int b[][] = new int[c][r];

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				b[i][j]  = a[j][i];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
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
		System.out.println("enter " + (r * c) + "element: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		TransposeMatrix a1 = new TransposeMatrix();
		a1.displayArray(arr, r, c);
		a1.TransElement(arr, r, c);
		
	}
}
