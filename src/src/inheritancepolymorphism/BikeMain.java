package inheritancepolymorphism;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pulsor p1= new Pulsor();
		p1.setBikeData(100000,"Black", "60km/hr", "Bajaj");//bike
		p1.setPulsorData("Pulsor",120, "Alpha");

		System.out.println(p1);
		p1.gears();
		p1.wheelno();
		
		p1.engine();*/
		
		
		PulsorRs ps= new PulsorRs();
		ps.setBikeData(100000,"Black", "40 km/ltr", "Bajaj");
		ps.setPulsorData("Pulsor RS", 150, "RS 150");
		ps.setPulsorRsData("BS 6", 140);
		
		System.out.println(ps);
		ps.wheelno();
		ps.gears();
	}

}
