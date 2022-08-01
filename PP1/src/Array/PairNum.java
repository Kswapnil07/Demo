package Array;

public class PairNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50,60};
		int v=30;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==v)
					System.out.println(a[i]+" "+a[j]+" "+v);
			}
		}
	}

}
