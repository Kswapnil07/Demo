import java.util.Scanner;

public class centimeterConvertsMK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length in centimeter:");
		float c=sc.nextFloat();
	
		float m=(c/100);
		float k=(c/100000);
		
		System.out.println("length in meter:"+m);
		System.out.println("length in kilometer:"+k);
	
	}

}
