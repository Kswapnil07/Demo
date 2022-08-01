package assignment5;
import java.util.Scanner;
public class FunctionSeries {
	void DoubleSeries(double n) {
		double sum=0;
	
		for(double i=1;i<=n;i++) {
		sum=sum+(1/i);
		
		}

		System.out.println(sum);
	}
	
	void DoubleSeries(double a ,double n) {
		
		double total=0,b=1;
		for(double i=0;i<n;i++) {
			total=total+b/Math.pow(a, b);
			b+=3;
		}
		System.out.println(total);
	
	}
	
	public static void main(String[] args) {
	 
	 FunctionSeries s1=new FunctionSeries();
	 Scanner sc=new Scanner(System.in);
			System.out.println("enter  no");
			double n=sc.nextDouble();
			s1.DoubleSeries(n);
			
			System.out.println("enter 2 no");
			double a=sc.nextDouble();
			n=sc.nextDouble();
			s1.DoubleSeries(n,a);

			}
	}


