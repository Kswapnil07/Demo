package constructorMain;

public class Son extends Father {

	String sname="swapnil";
	void setDataSon(String sname)
	{
		this.sname=sname;
	}
	void display() {
		
		
		System.out.println(sname+" "+fname+" "+lname);
	}
}
