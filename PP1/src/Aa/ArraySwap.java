package Aa;
import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,9,8,7,8};
		
		for(int i=0;i<5;i++)
		{
			int h=a[i];
			a[i]=a[i+5];
			a[i+5]=h;
		}
		System.out.println(Arrays.toString (a));
		
		
	}

}
