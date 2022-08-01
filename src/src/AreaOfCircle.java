import java.util.Scanner;

public class AreaOfCircle {
	
	//int r;
	
	int rsquare(int r)
	{
		return r*r;
	}
	
	void area(int r)//r=5
	{
		//int rsq=rsquare(r);
		double area= 3.14*rsquare(r);
		System.out.println("area of circle is: "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		int r= sc.nextInt();
		
		AreaOfCircle c1= new AreaOfCircle();
		
		//int sqr=c1.rsquare(r);
		//c1.area(c1.rsquare(r));
		c1.area(r); //5
		sc.close();
		
		AreaOfCircle c2= new AreaOfCircle();
		System.out.println("Enter the radius of circle:");
		r= sc.nextInt();
		
	}

}
