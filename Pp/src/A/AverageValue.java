package A;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50,60};
		int sum=0;
		float avr=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
			 avr=sum/a.length;
			
		}
		System.out.println(avr);
		
	}

}
