package A;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,6,20,8,7,15,12,11};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
