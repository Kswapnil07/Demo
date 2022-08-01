package classandobject18522;

public class discount {
	
	void Discount(caracc a)
	{
		int price=a.getprice();
		int installment=a.getinstallment();
		String payment=a.getpayment();
		double discount;
	
		if(payment.equals("cash") && installment==0) {

		discount =price*30/100;
		System.out.println(discount);
		
		}

	if (payment.equals("online") && installment==0){
		 discount =price*30/100;
		
		System.out.println(discount);
	}

	 if(installment==2) {
		discount=price*20/100;
		
		System.out.println(discount);
		
	 }
	if(installment==3) {
		
		
		System.out.println("no discount");
	}
	
	}
	
}