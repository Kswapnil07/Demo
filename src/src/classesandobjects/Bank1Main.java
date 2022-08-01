package classesandobjects;

public class Bank1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1= new Customer();
		c1.setAccno(547655);
		c1.setName("Anjali");
		c1.setBalance(50000);
		c1.setAddr("Pune");
		c1.setContact("9876543210");
		
		c1.setBalance(100000);
		System.out.println(c1.getName()+" "+c1.getAccno()+" "+c1.getBalance()+" "+c1.getContact()+" "+c1.getAddr());
	
		
	}

}
