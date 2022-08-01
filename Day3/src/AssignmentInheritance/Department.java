package AssignmentInheritance;

public class Department extends College {
	
	int numOfdept;
	String dname;
	

	public int getNumOfdept() {
		return numOfdept;
	}


	public void setNumOfdept(int numOfdept) {
		this.numOfdept = numOfdept;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String toString() {
		return id+" "+cname+" "+numOfdept+" "+dname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d=new Department();
		d.setId(101);
		d.setCname("coep");
		d.setNumOfdept(5);
		d.setDname("electrical");
		System.out.println(d);
	}

}
