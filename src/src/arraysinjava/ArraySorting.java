package arraysinjava;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={50,10,80,30,90,20,60,40,70}; //i=0 
		
		int len=arr.length;
		
		for( int i=0;i<len;i++) //quicksort
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]<arr[j])//arr[0]=50
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is: "+Arrays.toString(arr));
		System.out.println("Second Highest: "+arr[1]);
		System.out.println("Second minimum: "+arr[len-2]);
		
		
		int a[]={50,10,80,30,90,20,60,40,70};
		len=a.length;
		for( int i=0;i<len;i++) //bubble sort
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Bubble sort: "+Arrays.toString(a));
		
		System.out.println("Second Highest: "+a[len-2]);
		
		System.out.println("Second minimum: "+a[1]); //ascending
		
		
		int ar[]={50,10,80,30,90,20,60,40,70};
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		

	}

}
