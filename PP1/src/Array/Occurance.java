package Array;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,1,2,3,5,6,2,3,8,5,9};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&&j<i)
				{
					break;
				}
				else if(a[i]==a[j]&&j>=i)
				{
					cnt++;
				}
			}
			if(cnt!=0) {
				System.out.println(a[i]+" "+cnt);
			}
		}
		
	}

}
