package constructorMain;

public class Father extends Grandfather {

	String fname="sanjivan";
	void setDataFather(String fname)
	{
		this.fname=fname;
	}
	void display() 
	{

		System.out.println(fname+" "+gfname+" "+lname);
	}
}
