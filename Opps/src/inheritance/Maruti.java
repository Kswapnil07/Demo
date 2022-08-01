package inheritance;

public class Maruti extends Car {
	
	int id,installment;
	String modelno,modeofpaymment;
	void setDataMaruti(int id,String modelno,String modeofpayment, int  installment) {
		this.id=id;
		this.installment=installment;
		this.modelno=modelno;
		this.modeofpaymment=modeofpayment;
		
	}
	
	void discount() {
		
			
			if(modeofpaymment.equals("cash") && installment==0) {

			double discount =price*15/100;
			System.out.println("discount:"+discount);
			
			}

			else if (modeofpaymment.equals("online") && installment==0){
			 double discount =price*15/100;
			
			System.out.println("discount:"+discount);
		}

			else if(installment==1)
			{
			double discount=price*10/100;
			
			System.out.println("discount:"+discount);	
		 }
			else if(installment==2) {
         double discount=price*10/100;
			
			System.out.println("discount:"+discount);
			}
			}
		
		void display() {
			super.display();
			System.out.println(id+" "+installment+"" +modelno+" "+modeofpaymment);
		
		}
	}
	


