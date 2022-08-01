package classesandobjects;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1= new Account();
		//a1.setData(4567893, "Raj Yadav", 50000, "9876543210");
		a1.setAccno(4567893);
		a1.setName("Raj Yadav");
		a1.setBalance(50000);
		a1.setContact("9876543210");
		
		//System.out.println(a1.getAccno()+" "+a1.getName()+" "+a1.getContact()+" "+a1.getBalance());
		System.out.println(a1);
		//a1.setContact("765432106");
		
		
		Bank b1= new Bank();
		b1.gpay(10000, a1);
				
		
		System.out.println("Balance is: "+a1.getBalance());
		
		a1.setContact("7654321891");
		System.out.println(a1);

	}

}
