package aA;

public class MaxmimumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,3,20,80,60,40};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
