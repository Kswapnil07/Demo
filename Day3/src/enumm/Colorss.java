package enumm;

public enum Colorss {
	
	ORANGE("Red","Yellow")
	{
		public String toString()
		{
			return "orange is:red,yellow";
		}
	},
	GREEN("Blue","yellow")
	{
		public String toString()
		{
			return "green is:blue,yellow";
		}	
	},
	
	PINK("red","white")
	{
		public String toString()
		{
			return "pink is:red,white";
		}
	}
	,
	
	BROWN("Red","Black")
	{
		public String toString()
		{
			return "brown is:red,black";
		}
	},
	PURPLE("Blue","pink")
	{
		public String toString()
		{
			return "purple is:blue,pink";
		}
	};

	String x;
	String y;
	
	private Colorss(String x, String y)
	{
		this.x=x;
		this.y=y;
	}
}
