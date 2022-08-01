import java.util.Scanner;
public class rectangleofarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length,width,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
length=sc.nextInt();

System.out.println("enter the width");
width=sc.nextInt();
area=length*width;
System.out.println("area of rectangle:"+area);

	}

}
