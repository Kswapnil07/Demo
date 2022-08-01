package exception;

import java.io.IOException;
import java.sql.SQLException;

class AB
{
	void display() throws RuntimeException
	{
		System.out.println("in a parent class");
	}
}
class BC extends AB
{
	void display()throws ArithmeticException
	{
		System.out.println("in child class");
	}
}
public class ExceptionParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
