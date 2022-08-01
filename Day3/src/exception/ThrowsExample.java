package exception;

public class ThrowsExample {

	int getStringLength(String s)throws NullPointerException
	{
		if(s==null)
		{
			//System.out.println("String is null");
		
			throw  new NullPointerException("string is null");
		}
		return s.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample t1=new ThrowsExample();
		System.out.println(t1.getStringLength("India"));
		try
		{
			System.out.println(t1.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println(t1.getStringLength("mumbai"));
		System.out.println(t1.getStringLength("program"));
	}

}
