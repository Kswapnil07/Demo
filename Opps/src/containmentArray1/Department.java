package containmentArray1;

import java.util.Arrays;

public class Department {

	int totalemp;
	String name;
	Employee empl[];
	
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getEmpl() {
		return empl;
	}
	public void setEmpl(Employee[] empl) {
		this.empl = empl;
	}
	
	public String toString() {
		return totalemp+" "+name+" "+Arrays.toString(empl);
	}
}
