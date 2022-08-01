package encapsulation;

public class customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c1=new customer();
		c1.setAccno(658942);
		c1.setName("ram");
		c1.setBalance(500000);
		c1.setAddr("pune");
		c1.setContact("9156164415");
		
		
		
//		c1.setContact("7768949523");
//		
		c1.setAddr("latur");
//		c1.setBalance(1000000);
		System.out.println(c1.getName()+"  "+c1.getAccno()+" "+c1.getBalance()+" "+ c1.getContact()+" "+c1.getAddr());
	}

}
