package inheritance;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pulsor p1=new Pulsor();
		p1.setBikeData(100000, "black","bajaj", "50km/hr" );
		p1.setPulsorData(120, "pulsor","sgeh");
		System.out.println(p1);
		p1.engine();
		p1.wheelno();
	}

}
