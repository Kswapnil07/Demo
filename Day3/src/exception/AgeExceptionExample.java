package exception;

import AssignmentException.AgeException;

public class AgeExceptionExample {

	void validate (int age)throws AgeException
	
	{
		if(age<18)
		{
			throw new AgeException("age is less than 18 not allow for ride ");
		}
		else if (age>60)
		{
			throw new AgeException("age is greater than 60 not allow for ride ");			}
	
	else 
	 {
		 System.out.println("enjoy your ride");
	 }
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=30;
		AgeExceptionExample aee=new AgeExceptionExample();
		try {
			aee.validate(age);
		}
		catch(AgeException e)
		{
			e.printStackTrace();
	}
		System.out.println("done");
}
	}
	
