package Array;

import java.util.Arrays;

public class ArrayBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {50,10,80,30,90,20,60,40,70};
int len=a.length;
	for(int i=0;i<len;i++)     //bubble sort
{
		for(int j=0;j<len-1;j++)
		{
			if(a[j] >a [j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;	
		}
	
	}
		}
	System.out.println("bubble sort: "+Arrays.toString(a));
	System.out.println("second highest:"+a[len-2]);
 	System.out.println("second minimum:"+a[1]);
	}
}
