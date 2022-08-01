package A;

import java.util.Arrays;

public class ArrayOfOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				cnt++;
			}
		}
		int b[]=new int[cnt];
		int g=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[g]=a[i];
						g++;
						
			}
			
		}
		
		System.out.println(Arrays.toString(b));	
		
	}

}
