package aA;

import java.util.Arrays;

public class CountNegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,-5,8,-9,-3,-1,4,-2,5,-7};
		int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				
				if(a[i]<0)
				{
					cnt++;
				}
			}
			System.out.println("count negative element:"+cnt);
		}
	}


