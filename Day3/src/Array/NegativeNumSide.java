package Array;

import java.util.Arrays;

public class NegativeNumSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-3,6,-7,8,-4,3,-2,5,-9};
		
		for(int i=0;i<arr.length;i++)
		{
			for( int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
					
					
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
	}

}
