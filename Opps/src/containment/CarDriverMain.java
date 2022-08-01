package containment;

public class CarDriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver d1=new Driver(101,"ram","7768949523");
		Driver d2=new Driver(101,"raj","7768949523");

		
		Car c1=new Car(1,"baleno","maruti",d1);
		Car c2=new Car(2,"Swft","maruti",d2);
		
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
