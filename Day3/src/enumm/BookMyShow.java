package enumm;

interface A{
	void discription();
}
public enum BookMyShow {

	SILVER(150)//public static final
	{
		public String toString()
		{
			return "rate of siliver tickets:Rs 150/-";
		}
		public void discription()
		{
			System.out.println("rate of siliver tickets:Rs 150/-");
		}
	}
	
	
	,GOLD(200)
	{
		public String toString()
		{
			return "rate of gold tickets:Rs 200/-";
		}
		public void discription()
		{
			System.out.println("rate of siliver tickets:Rs 200/-");
		}
	}
	
	,PLATINUM(250)
	{
		public String toString()
		{
			return "rate of platinum tickets:Rs 250/-";
		}
		public void discription()
		{
			System.out.println("rate of siliver tickets:Rs 250/-");
		}
	};
	
	
	int rate;
	private BookMyShow(int rate)
	{
		this.rate=rate;
	}
	
	public void discription()
	{
		System.out.println("rate of siliver tickets:Rs 150/-");
	}
	void message()
	{
		System.out.println("rate:"+rate);
	}
}
