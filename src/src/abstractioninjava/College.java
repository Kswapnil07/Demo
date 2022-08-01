package abstractioninjava;

public interface College {
	
	void uniform();
	void idCard();
	void transport();
	default void canteen()
	{
		System.out.println("Canteen not compulsory");
	}
	default void library()
	{
		System.out.println("membership is mandatory");
	}
	
	
	static void labratory()
	{
		System.out.println("Labs are compulsory for all");
	}
	
	//Java 1.9
	/*private void accounts()
	{
		System.out.println("Confidential information");
	}*/

}
