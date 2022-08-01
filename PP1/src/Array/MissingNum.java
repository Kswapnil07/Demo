package Array;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,5,6,8};
		int cnt=1;
		
		for(int i=0;i<a.length;)
		{
			if(a[i]==cnt)
			{
				i++;
			cnt++;
			
		}
		else {
			System.out.println(cnt);
			cnt++;
		}
	}
	}
}
