package containmentArray;

import java.util.Arrays;

public class Department1 {

	int did;
	String dname;
	Student1 stud[];
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Student1[] getStud() {
		return stud;
	}
	public void setStud(Student1[] stud) {
		this.stud = stud;
	}
	public String toString() 
	{
		return did+" "+dname+" "+Arrays.toString(stud);
	}
}
