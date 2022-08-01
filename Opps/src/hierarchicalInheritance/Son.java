package hierarchicalInheritance;

public class Son extends Father {

	
	String eduction , sname;
	
	void setDataSon(String eduction,String sname) {
		this.eduction=eduction;
		this.sname=sname;
	}
	public void display() {
		super.display();
		System.out.println(eduction+" "+sname);
	
	}
}
