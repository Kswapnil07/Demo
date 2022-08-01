package classes;

public class car {
void wheelNo() {
	System.out.println("4 wheels");
}
void dashboard() {
System.out.println("compulasory for each car");
}
void engincapacity() {
	System.out.println("average engine capacity: 1100 cc");
}
void milage() {
	System.out.println("milage: 20km/ltr");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car();
		car c3=new car();
		System.out.println("first car");
		c1.engincapacity();
		c2.milage();
	}

}
