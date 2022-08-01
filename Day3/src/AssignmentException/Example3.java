package AssignmentException;

public class Example3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=20;
		}
		
		finally
		{
			int a=10;
			
		System.out.println("final block always executed:"+a);
		
		}
		
	}

}
