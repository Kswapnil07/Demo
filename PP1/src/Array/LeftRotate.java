package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,8,9,6};
	
		{
			int j,l;
			l=a[a.length-1];
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=l;
			
			

			
		}
		System.out.println(Arrays.toString(a));
	}

}
