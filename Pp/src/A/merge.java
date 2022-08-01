package A;

import java.util.Arrays;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,6};
		int b[]= {7,8,9};
		
		int c[]=new int[8];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		for(int i=0;i<c.length;i++)
		{
			
		}
		
		System.out.println(Arrays.toString(c));
		
		
	}

}
