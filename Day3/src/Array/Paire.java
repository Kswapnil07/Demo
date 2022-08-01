package Array;

public class Paire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=25;
		int arr[]= {11,15,4,10,6,17,3};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					System.out.println(arr[i]+" "+arr[j]+": "+n);
				}
				
			}
			
			
		}
		
	}

}
