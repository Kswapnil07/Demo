package Assignment3;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int r=sc.nextInt();
		
		for(i=r;i>=1;i--) {
		for(j=i-1;j>=1;j--) {
			
			System.out.print(" ");
		}
		for(j=i;j<=r;j++) {
			System.out.print(j);
		}
		for(j=r-1;j>=i;j--) {
			System.out.print(j);
	}
 	System.out.println();
		}
		}
	
		}
