package aA;

import java.lang.reflect.Array;

public class CountOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,91,10};
		int evencnt=0;
		int oddcnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				evencnt++;
			}
			else
			 oddcnt++;
		}
		System.out.println(evencnt);
		System.out.println(oddcnt);
		
	}

}
