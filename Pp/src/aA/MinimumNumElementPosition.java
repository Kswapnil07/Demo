package aA;

public class MinimumNumElementPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,5,6,3,2,7,57};
		
		int min=a[0];
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
				s=i;
			}
		}
		
		
		System.out.println("minimum number:" +min+ " index position :"+" "+s);
	}
	
	

}
