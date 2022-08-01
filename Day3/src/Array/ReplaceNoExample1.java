package Array;
import java.util.Scanner;
public class ReplaceNoExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		System.out.println("enter element of array");
		int arr[]=new int [size];
		
        for(int i=0;i<size;i++) {
	   arr[i]=sc.nextInt();
	  System.out.println(arr[i]+" ");
	  }
      System.out.println();
       for(int i=0;i<size;i++) {
       if(arr[i]==0) {
	   arr[i]=1;
        }
      System.out.println(arr[i]+" ");
        }
        }
        }