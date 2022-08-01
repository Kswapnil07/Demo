package array;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {55,2,6,8,9,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j] >a [j+1]) 
				{
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
			}
					
				}
			}
		System.out.println("second highest:"+a[a.length-2]);

		}
	}


