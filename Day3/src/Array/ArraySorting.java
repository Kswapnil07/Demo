package Array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {50,10,80,30,90,20,60,40,70};
int len=arr.length;
for(int i=0;i<len;i++)
{
	for(int j=i+1;j<len;j++)
	{
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
}

System.out.println("sorted array:" +Arrays.toString(arr));
	}
}
