package Array;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,8,7,9,10};
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		float b=sum/a.length;
		System.out.println(b);
	}

}
