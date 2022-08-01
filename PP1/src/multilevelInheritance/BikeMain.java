package multilevelInheritance;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bullet350 b=new Bullet350();
		b.bikeData(200000, "black", "2020");
		b.bulletData(2021, "bullet350");
		b.bullet350Data(180, "crtdstd");
		b.display();
		b.seat();
		b.gears();
		b.wheelno();
	}

}
