package pattern;
import java.util.Scanner;
public class numpattern2 {

	public static void main(String[] arg){
			int r;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the row numbe");
	r=sc.nextInt();
	for(int i=1;i<=r;i++)
	{
		
			System.out.print(i+"");
		}
		System.out.println();				

			for(int i=r-1;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+"");
				}
			
					
						System.out.println();
		}		
	}
}
