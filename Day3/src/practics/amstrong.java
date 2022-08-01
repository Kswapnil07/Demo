package practics;
import java.util.Scanner;
public class amstrong {

	public static void main(String[] args) {
	int num,temp,cnt=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("entere any number");
	num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		cnt++;
		temp=temp/10;
	}
	    temp=num;
	    while(temp!=0)
	    {
	    	int r= temp%10;
	    	//int pow=math.pow(r,cnt);
	    int pow=1;
	    	for(int i=1;i<=cnt;i++)
	    	{
	    		pow=pow*r;
	    	}
	    	temp=temp/10;
	    	sum=sum+pow; 
	    }
if(num==sum)
	
		System.out.println("Amstrong number");
	else
		System.out.println(" not amstrong number");
	}
}

