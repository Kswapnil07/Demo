package assignment5;

import java.util.Scanner;

public class FunctionSeries1 {

	
		void DoubleSeries(double n) {
			double sum=0;
		
			for(double i=1;i<=n;i++) {
			sum=sum+(1/i);
			
			}

			System.out.println(sum);
		}
		
		void DoubleSeries(double a ,double n) {
			
			double sum, total=0,b=1;
			for(double i=1;i<=n;i++)
			{
			sum=1;
			for(double j=1;j<=b+1;j++)
			{
				sum*=a;
			}
			total+=b/sum;
			b+=3;
			}
			System.out.println(total);
		
		}
		
		public static void main(String[] args) {
		 
		 FunctionSeries1 s1=new FunctionSeries1();
		 Scanner sc=new Scanner(System.in);
				System.out.println("enter num");
				double n=sc.nextDouble();
				s1.DoubleSeries(n);
				
				System.out.println("enter 2 num");
				double a=sc.nextDouble();
				n=sc.nextDouble();
				s1.DoubleSeries(a,n);

	}

}
