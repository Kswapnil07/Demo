package Array;

public class CountNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,-8,6,-5,2,-6,4,-4,-8};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<0)
				cnt++;
		}
		System.out.println(cnt);
	}

}
