package string;

import java.util.Arrays;

public class SwapDigits {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<3;i++)
		{
			
			int c=a[i];
			a[i]=a[i+3];
			a[i+3]=c;
			
		}
        System.out.println(Arrays.toString(a));
	}

}
