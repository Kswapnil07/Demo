package classes;
import java.util.Scanner;
public class areaofcircle {
int rsquare(int r) {
	return r*r;
}
void area(int r) {

	double area=3.14*rsquare(r);
	System.out.println("area of circle is:"+area);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of circle");
int r=sc.nextInt();
areaofcircle c1= new areaofcircle();
c1.area(r);


System.out.println("enter the radius of circle");
 r=sc.nextInt();
areaofcircle c2= new areaofcircle();
c2.area(r);

	}

}
