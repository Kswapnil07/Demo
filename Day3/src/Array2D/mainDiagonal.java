package Array2D;

import java.util.Scanner;

public class mainDiagonal {
	
	void displayArray(int a[][], int r, int c) {
		System.out.println("element of array are: ");
		for (int i=0; i<r; i++)
		{
			
			for (int j=0; j<c; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}


	void Add1Element(int a[][], int r, int c)
	{
		int sum = 0;
		for (int i = 0; i<r; i++) {
			
			for (int j=0; j<c; j++)
			{
				if(i==j) 
				{
				sum = sum + a[i][j];
				
			}
			
			}
		}
			System.out.println("sum of main diagonal element:" +sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col");
		r = sc.nextInt();
		c = sc.nextInt();

		int a[][] = new int[r][c];
		System.out.println("enter " + (r * c) + "element: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		mainDiagonal a1 = new mainDiagonal();
		a1.displayArray(a, r, c);
		a1.Add1Element(a, r, c);
	}

}



