package pattern;
import java.util.Scanner;
public class num {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter row number");
		r=sc.nextInt();
		int a=0,b=1;
		for(int i=1;i<=r;i++)
		{
			
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print(a+" ");	
				
				int c=a+b;
				a=b;
				b=c;
			}
			
			System.out.println();
			a=0;
			b=1;
	}
	}
}