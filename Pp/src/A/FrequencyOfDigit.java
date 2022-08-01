package A;

public class FrequencyOfDigit {
	
	public void frq(int a[])
	{
		int array[]= new int[a.length];
		
		for(int h =0;h<array.length;h++)
		{
			array[h]=a[h];
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				
					cnt++;	
					a[j]='@';
				}
	
	}
			if(a[i]!='@')
			System.out.println(a[i]+" "+cnt);	
		}
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,1,2,3,4,5,9};
		
		FrequencyOfDigit some = new FrequencyOfDigit();
		
		some.frq(a);
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			int j=i;
//			int cnt=0;
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//				
//					cnt++;
//					
//					
//				}
//				
//				
				
	}
	}

