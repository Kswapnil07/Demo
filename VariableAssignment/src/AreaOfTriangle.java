import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float area;
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the breadth");
float x=sc.nextInt();
System.out.println("enter the length");
float y=sc.nextInt();
area=(x*y)/2;

System.out.println("Area of trangle:"+area);
	}

}
