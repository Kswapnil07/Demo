package Array2D;

import java.util.Scanner;

public class Array2Dexample {
	void displayArray(int a[][], int r, int c) {
		System.out.println("element of array are: ");
		for (int i = 0; i < r; i++)
		{
			
			for (int j = 0; j < c; j++)
			{
				System.out.print(a[i][j] + " \t");
			}
			System.out.println();
		}
	}

	void AddElement(int a[][], int r, int c)
	{
		int sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("addition of element array is:" + sum);

	}

	void mulElement(int a[][], int r, int c)
	{
		int mul = 1;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mul = mul * a[i][j];
			}
		}
		System.out.println("mul of element array is:" + mul);

	}
	void Add1Element(int a[][], int r, int c)
	{
		
		for (int i = 0; i <r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum = sum + a[i][j];
				
			}
			System.out.println("addition of element array is:" + sum);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col");
		r = sc.nextInt();
		c = sc.nextInt();

		int arr[][] = new int[r][c];
		System.out.println("enter " + (r * c) + "element: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		Array2Dexample a1 = new Array2Dexample();
		a1.displayArray(arr, r, c);
		a1.AddElement(arr, r, c);
		a1.mulElement(arr, r, c);
a1.Add1Element(arr, r, c);
	}

}
