package hierarchical;

public class son extends Father {

	int age;
	String sname;
	
	void dataSon(int age,String sname)
	{
		this.age=age;
		this.sname=sname;
		
	}
	
	void display() {
		super.display();
		System.out.println(age+" "+sname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son s=new son();
		s.data(45, "ddcdk");
		s.dataSon(25, "ctrtrx");
		s.display();
		
		
		Daughter d=new Daughter();
		d.dataD(21, "strsh", "ddtr");
		d.data(45, "esresr");
		d.display();
	}

}
