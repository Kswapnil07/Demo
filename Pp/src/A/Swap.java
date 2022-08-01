package A;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {111,2,3,1100,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++) {
			
			int x=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=x;
		
		}
		System.out.println(Arrays.toString(a));
			
	

	}}
