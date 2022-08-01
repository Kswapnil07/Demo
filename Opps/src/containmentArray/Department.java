package containmentArray;

import java.util.Arrays;

public class Department {

	int did;
	String dname;
	Student stud[];
	Department(int id,String name,Student stud[] ){
		this.did=id;
		this.dname=name;
		this.stud=stud;
	}
	public String toString() {
		return did+" "+dname+" "+Arrays.toString(stud)+"\n\n";
	}
}
