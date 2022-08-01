package aggergation;

public class Address {

	String city ,state;
	
	Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
	void display() {
		System.out.println(city+" "+state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
