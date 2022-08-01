package array;

import java.util.Arrays;

public class IteratingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10, 20, 20, 30, 5, 0, 6, 0};
		int []b=new int[8];
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}

}
