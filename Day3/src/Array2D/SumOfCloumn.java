package Array2D;
import java.util.Scanner;

public class SumOfCloumn {

	void displayArray(int a[][], int r, int c) {

		System.out.println("Element of array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}
	
	void colelement(int a[][], int r, int c) {

		for (int i = 0; i < c; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
			
					sum = sum + a[i][j];

				}
			System.out.println(" col element of sum:"+sum);
			}
		
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
		SumOfCloumn a1 = new SumOfCloumn();
		a1.displayArray(arr, r, c);
		a1.colelement(arr, r, c);
		
	}
}


