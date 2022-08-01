package multilevelInheritance;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PulsorRs ps=new PulsorRs();
		ps.setBikeData(120000, "black", "40km/ltr", "bajaj");
		ps.setPulsorData(150, "150 rs", " pulsorrs");
		ps.setPulsorRsdata(150, " BS6");
		System.out.println(ps);
		ps.wheelno();
		ps.gears();
		
		
	}

}
