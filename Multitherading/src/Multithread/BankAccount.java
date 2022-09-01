package Multithread;

public class BankAccount {

	int balance =5000;
	public void transfer(int amt)
	{
		System.out.println("please wait...!!!");
		synchronized(HDFCATM.class)//this
		{
			balance =balance+amt;
			System.out.println("Balance is:"+balance);
		}
	}
}
