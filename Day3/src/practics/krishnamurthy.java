package practics;
import java.util.Scanner;
public class krishnamurthy {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
			int n=sc.nextInt();
			int fact=n;
			int sum=0;
			while(n!=0)
			{
				int b=1;
				int r=n%10;
				for(int i=1;i<=r;i++)
				{
				b = b*i;
				}		
				
					sum=sum+b;
					n=n/10;
				}
			

	if(fact==sum)
	{
		System.out.println("number is krishnamurthy ");
	}
	else
		System.out.println(" number is not krishnamurthy  ");
			}
}	
