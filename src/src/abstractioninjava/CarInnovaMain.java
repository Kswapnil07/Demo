package abstractioninjava;

public class CarInnovaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c= new Car();
		Car i1= new InnovaCresta();
		//InnovaCresta i1= new InnovaCresta();
		i1.setData(2200000, "Toyota");
		System.out.println(i1);
		i1.wheelno();
		i1.gears();
		i1.dashBoard();
		i1.engine();
		i1.noOfSeats();
		i1.wheelType();
		
		System.out.println();
		
		/*Fortuner f1= new Fortuner();
		f1.setData(4500000, "Toyota");
		System.out.println(f1);
		f1.dashBoard();
		f1.engine();*/

	}

}
