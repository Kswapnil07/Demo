package classs;

public class SimpleIn {

	int mul(int p,int r,int t)
	{
		return p*r*t;
	}
	void simple(int p,int r,int t)
	{
		double simple= mul(p,r,t)/100;
		
		System.out.println(simple);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleIn s=new SimpleIn();
		s.simple(5, 10, 10);
		
	}

}
