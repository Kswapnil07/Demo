package practics;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i=300;i<=400;i++)
		{
			int cnt=0;
		
			for(int a=2;a<=i/2;a++) 
			{
			if(i%a==0)
			
			{
				cnt++;
				
			}
			}		
		
          if(cnt==0)
	
	System.out.println(i);
	
	}
	}
	}
