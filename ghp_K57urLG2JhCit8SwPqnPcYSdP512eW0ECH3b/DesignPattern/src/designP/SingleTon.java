package designP;

public class SingleTon {

	static SingleTon obj=new SingleTon();//early instantiation
	//static SingleTon obj=null; //lazy instantiation
	
	
	String str;
	
	private SingleTon()
	{
		str="Core Java";
	}
	public  SingleTon getInstnce()
	{
//		if(obj==null)
//		{
//			obj=new SingleTon();
//			
//		}
		return obj;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTon s1=new SingleTon().getInstnce();
		SingleTon s2=new SingleTon().getInstnce();
		SingleTon s3=new SingleTon().getInstnce();
		
		s1.str=s1.str.toUpperCase();
		
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		
//		s1.str=s1.str.toLowerCase();
//		
//		System.out.println(s1.str);
//		System.out.println(s2.str);
//		System.out.println(s3.str);
		
	}

}
