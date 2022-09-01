package Multithread;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCATM atm1=new HDFCATM();
		
		Thread t1=new Thread(atm1);
		Thread t2=new Thread(atm1);

		t1.start();
		t2.start();
		

		
	}

}
