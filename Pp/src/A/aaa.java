package A;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,0,0,3,1,2,3,4};
		int b[]=new int[a.length];
		int v=-1;
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					b[i]=v;
				}
			}
			if(b[i]!='v')
				b[i]=cnt;
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}
			
										
	}

}
