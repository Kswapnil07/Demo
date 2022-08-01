package abstraction;

public class CarInnovaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnovaCresta i1=new InnovaCresta();
		i1.detData(25000000, "toyota");
		System.out.println(i1);
		i1.wheelNo();
		i1.gears();
		i1.dashBoard();
		i1.engine();
		i1.noOfSeat();
		i1.wheelType();
		
		System.out.println();
		
//		Fortuner f1=new Fortuner();
//		f1.detData(4500000,"toyota");
//		System.out.println(f1);
//		f1.wheelNo();
//		f1.gears();
//		f1.dashBoard();
//		f1.engine();
//		f1.noOfSeat();
	}

}
