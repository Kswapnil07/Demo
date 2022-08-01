package aA;

public class DuplicateElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,5,2,3};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[j]);
					
				}
				
			}
			
		}
		System.out.println("Duplicate element count:"+count);
		
	}

}
