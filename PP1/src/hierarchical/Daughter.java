package hierarchical;

public class Daughter extends Father {

	int age;
	String dname,eduction;
	
	void dataD(int age,String dname,String eduction)
	{
		this.age=age;
		this.dname=dname;
		this.eduction=eduction;
	}
	void display() 
	{
		super.display();
		System.out.println(age+ ""+dname+ " "+eduction);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
