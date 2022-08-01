package polymorphism;

public class Area {
	void area(float x,float y) {
		System.out.println(" area of rectangle:"+(x*y));
	}
	void area(int x) {
		System.out.println("area of square:"+(x*x));
		
	}
	void area(double x) {
		
		double z =3.14*x*x;
		System.out.println("area of circle:"+(z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1=new Area();
		a1.area(5.0d);
		a1.area(5);
		a1.area(5f, 7f);
	}

}
