package pattern;
import java.util.Scanner;
public class numpattern14 {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row number");
		r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=r;i>=1;i--) {
			for(int j=1;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}
