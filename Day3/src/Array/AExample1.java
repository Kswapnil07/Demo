package Array;
import java.util.Scanner;
public class AExample1 {

	public static void main(String[] args) {
		
//int arr[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("length of array :"+arr.length);
		System.out.println("enter element of array");
		
for(int i=0;i<arr.length-1;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("array element are");
for(int i=0;i<arr.length-1;i++) {
	System.out.println(arr[i]+" ");
		
	}
	}
}
