package pattern;
import java.util.Scanner;
public class numpattern8 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j>=1;j--) {
				System.out.print(j); 
			}
					for(int j=2;j<=i;j++) {
						System.out.print(j);
				}
					System.out.println();
			}
		}
	}
	

