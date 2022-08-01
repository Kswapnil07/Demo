package aA;

public class MinimumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,6,5,10,60,30,20,10};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}

}
