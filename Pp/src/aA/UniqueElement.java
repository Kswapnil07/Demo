package aA;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,1,2,3,7};
		for(int i=0;i<a.length;i++) 
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.println(a[i]+" ");
		}
		}
		
	}

}
