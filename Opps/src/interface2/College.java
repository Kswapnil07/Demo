package interface2;

public interface College {
	void uniform();
	void idCard();
	void transport();
	
	default void library() 
	{
		System.out.println("membership is mandatory");
	}
	static void labratory()
	{
	System.out.println("compulsory all");	
	}
	
}
