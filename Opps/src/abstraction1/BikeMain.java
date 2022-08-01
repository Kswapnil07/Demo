package abstraction1;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pulsor p=new Pulsor();
		p.setDataBike(125000, "black", "bajaj");
		p.setData("220f",3);
		p.gears();
		p.features();
		p.seatno();
		p.discount();
		p.display();
		
		System.out.println();
		
		Activa a=new Activa();
		a.setDataBike(90000, "black", "honda");
		a.setData1("activa 4g",3);
		a.gears();
		a.features();
		a.seatno();
		a.discount();
		a.display();
	}

}
