package aA;

import java.util.Arrays;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,1,3,4,2};
		int b[]= {3,4,5,6,7,8};
		
	       System.out.println("Array1 : "+Arrays.toString(a));
//
	       System.out.println("Array1 : "+Arrays.toString(b));

		for(int i=0;i<a.length;i++)
		{
		
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
				
				System.out.print("common element:"+a[i]+" ");
		}
			
		}
		
		}
	}


