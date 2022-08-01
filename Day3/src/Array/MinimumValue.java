package Array;
import java.util.Scanner;
public class MinimumValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter size of array");
		int size=sc.nextInt();
	    int a[]=new int [size];
	    System.out.println("enter array element");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
	    	int min=a[0];
	    
for(int i=1;i<a.length;i++)
{
	if(a[i]<min)
		min=a[i];
}
System.out.println("minimum value of array: " +min);
	    }
	}


