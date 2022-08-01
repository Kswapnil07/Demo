package inheritancepolymorphism;

public class Son extends Father{
	
	String education;
	
	
	void setSOnData(String education)
	{
		this.education=education;
	}
	
	
	public String toString()
	{
		return name+" "+surname+" "+age+" "+education;
	}

}
