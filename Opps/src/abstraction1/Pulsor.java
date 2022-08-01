package abstraction1;

public class Pulsor extends Bike {

	int installment;
	String modelno;
		void setData(String modelno,int installment) {
			this.modelno=modelno;
			
			this.installment=installment;
		}
		void gears() {
			System.out.println("5 gears");
		}
		void features() {
			System.out.println("meter,disc");
		}
		void seatno() {
			System.out.println("2 seat");
		}
		void discount()
		{
			
			if(installment==0)
			{
				double discount =price*15/100;
					
				System.out.println("discount:"+discount);
		}
			if(installment ==2)
			{
				double discount =price*10/100;
				System.out.println("discount:"+discount);	
			}
			if(installment ==3) {
				double discount =price*5/100;
				System.out.println("discount:"+discount);	
			}
		}
		void display()
		{
			super.display();
			System.out.println(modelno+" " +installment);
		}
	
}
