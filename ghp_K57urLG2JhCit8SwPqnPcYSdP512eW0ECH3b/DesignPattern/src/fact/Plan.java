package fact;

public  abstract class Plan {

	protected double rate;
	abstract void getRate();
	
	void generateBill(int units)
	{
		System.out.println("Total bill is:Rs"+(rate*units));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
