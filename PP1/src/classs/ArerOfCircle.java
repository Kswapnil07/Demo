package classs;

public class ArerOfCircle {

	int rsquare(int r) {
		return r*r;
	}
	void area (int r)
	{
		double area =3.14*rsquare(r);
		
		System.out.println(area);
	}

	public static void main(String[] args) {
		ArerOfCircle a=new ArerOfCircle();
		a.area(5);
	}
}
