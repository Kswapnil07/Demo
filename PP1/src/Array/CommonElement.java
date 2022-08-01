package Array;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,1,3,6,5,4,7,8,5,21,3,4,6};
		
		for(int i=0;i<a.length;i++)
		{
		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				
					System.out.println(a[i]);
					
				
			}
		}
	}

}
