package inheritancepolymorphism;

public class CarDriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Driver d1= new Driver(1001,"Sachin","9876543210");
		Driver d2= new Driver(1003,"Ramesh","8765432198");
		
		Car c1= new Car(1,"Baleno","Maruti",d1);	
		Car c2 = new Car(2,"Swift Desire","Maruti",d2);*/
		
		
		Car c1= new Car(1,"Baleno","Maruti",1001,"Sachin","9876543210");	
		Car c2 = new Car(2,"Swift Desire","Maruti",1003,"Ramesh","8765432198");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
