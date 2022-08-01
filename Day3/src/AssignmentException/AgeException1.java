package AssignmentException;


public class AgeException1 {

	void validate (int age)throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("age is less than 18 not allow for bank acc ");
		}
		
		else if (age>18)
		{
			throw new AgeException("age is greater than 18 allow for bank acc");			}
	
      }

	public static void main(String[] args) {
	

		int age=25;
		AgeException1 a=new AgeException1();
		try {
			a.validate(age);
		}
		catch(AgeException e)
		{
			e.printStackTrace();
	}
		System.out.println("done");
}
	}
	


