package Assignment4;
import java.util.Arrays;
import java.util.Scanner;
public class RelpaceValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter size number");
int r=sc.nextInt();
int arr[]=new int[r];

System.out.println("enter "+r+"element");
for(int i=0;i<r;i++)
{
	arr[i]=sc.nextInt();
}
	System.out.println(Arrays.toString(arr));
	System.out.println();
	
	for(int i=0;i<r;i++) {
		if(arr[i]<0) {
			arr[i]=arr[i-1]*arr[i-1];
		}
		
	}
System.out.println(Arrays.toString(arr));	
}


	}


