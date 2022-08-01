package hierarchicalInheritance;

public class Daughter extends Father {
	
	String dname,gender;
	
	void setDataDaughter(String dname,String gender) {
		this.dname=dname;
		this.gender=gender;
	}
		public void display() {
			super.display();
			System.out.println(dname+" "+gender);
		}
	}

	
