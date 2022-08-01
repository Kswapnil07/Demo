package pattern;
import java.util.Scanner;
public class num01123 {

	public static void main(String[] args) {
		int r=4;
		int a=0;
		int b=1;
		
			Scanner sc=new Scanner (System.in);
			System.out.println("enter number ");
			r=sc.nextInt();
			for( int i=1;i<=r;i++){
				
			for(int j=1;j<=i;j++)
				{
					System.out.print( a+ " ");
					int c=a+b;
					a=b;
					b=c;	
				}
				System.out.println();
			}
	    } 
     }
