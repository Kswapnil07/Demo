package Multithread;

public class HDFCATM extends Thread {
	
	BankAccount obj= new BankAccount();
	{
		System.out.println("Deposting amount please wait...!!!");
		obj.transfer(20000);
		System.out.println("Transaction done...!!!");
	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
