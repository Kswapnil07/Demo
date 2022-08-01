package arraysinjava;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*int arr[]={1,2,5,6,8,9,11,12};
		
		//int cnt=arr[0],d=arr[1]-arr[0];
		int cnt=1;
		
		for(int i=0;i<arr.length;)//i=6
		{
			if(arr[i]==cnt)//arr[6]=9  cnt=10
			{
				i++;
				cnt++;
			}
			else
			{
				System.out.println(cnt);//4 8 10
				//cnt=cnt+2;//cnt= 12
				cnt++;
			}
			
		}*/
		
		  //     0  1  2  3  4  5
		int a[]={10,20,30,40,50,60};  //60 50 40 30 20 10
		int n=a.length; //6  3
		
		for(int i=0;i<n/2;i++)//i=3  
		{
			int temp=a[i]; //temp=a[2]=30
			a[i]=a[n-i-1]; //a[2]=a[6-2-1]=a[3]=40
			a[n-i-1]=temp; //a[3]=temp=30
		}
		
		System.out.println("Reverse of Array is: ");
		System.out.println(Arrays.toString(a));//utility class
		
		

	}

}
