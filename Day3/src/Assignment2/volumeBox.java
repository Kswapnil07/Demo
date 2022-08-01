package Assignment2;
import java.util.Scanner;
public class volumeBox {
double length,width,height,volume=0.0;
void box(double l,double w,double h) {
	length=l;
	width=w;
	height=h;
}
void volume() {
	volume=(length*width*height);
}
public String toString() {
	return("volume="+(length*width*height));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
volumeBox b1=new volumeBox();
System.out.println("enter length width height");
double len=sc.nextDouble();
double wid=sc.nextDouble();
double hei=sc.nextDouble();
b1.box(len,wid,hei);
System.out.println(b1);

volumeBox b2=new volumeBox();
System.out.println("enter length width height");
len=sc.nextDouble();
wid=sc.nextDouble();
hei=sc.nextDouble();
b2.box(len, wid, hei);
System.out.println(b2);


	}

}
