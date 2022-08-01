package practics;
import java.util.Scanner;
public class citizen {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("account holder age");
	int s=sc.nextInt();
	System.out.println("citizenship in pune");
	char p=sc.next().charAt(0);
	if(s>=18 && s!=p)
	
	{
		if(s>=18 && s!=p)

		System.out.println(" open account ");
		else
			System.out.println(" citizen out of pune does not open acc ");

			
	}

	}

}
