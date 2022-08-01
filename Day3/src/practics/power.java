package practics;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		int a,b,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("base value");
		a=sc.nextInt();
		System.out.println("exponent value");
		b=sc.nextInt();

		
		while(b>0)
		{
			c=(c*a);
			b--;
		}
		
		System.out.println("power is calculate for:"+c);

	}

}
