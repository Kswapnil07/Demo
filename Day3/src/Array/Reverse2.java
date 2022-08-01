package Array;

import java.util.Arrays;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		int n=a.length;
		for(int i=0;i<3;i++) {
		int temp=a[i];
		a[i]=a[n-2];
		a[n-2]=temp;

		}
		System.out.println("reverse of array is :");
		System.out.println(Arrays.toString(a));

	}

}
