package Array2D;
import java.util.Scanner;
public class SubTwoMatrix {

	void displayArray(int a[][], int r, int c) {

		System.out.println("elemrnt of array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	void displayArray1(int b[][], int r1, int c1) {
		System.out.println("elemrnt of array");

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

	void subElement(int a[][], int b[][], int r, int c, int r1, int c1) {
		System.out.println("subtract element");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(+b[i][j] - a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int r = sc.nextInt();
		System.out.println("enter the col");
		int c = sc.nextInt();
		System.out.println("enter" + (r * c) + "element");

		int a[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();

			}
		}

		System.out.println("enter the row");
		int r1 = sc.nextInt();
		System.out.println("enter the col");
		int c1 = sc.nextInt();
		System.out.println("enter" + (r * c) + "element");
		int b[][] = new int[r1][c1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		SubTwoMatrix s = new SubTwoMatrix();
		s.displayArray(a, r, c);
		s.displayArray1(b, r, c);
		s.subElement(a, b, r, c, r1, c1);
	}

}
