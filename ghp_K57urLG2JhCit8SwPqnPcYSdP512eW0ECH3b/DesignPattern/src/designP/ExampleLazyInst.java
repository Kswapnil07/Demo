package designP;

public class ExampleLazyInst {

	
static ExampleLazyInst obj=null; //lazy instantiation
	
	
	String str;
	
	private ExampleLazyInst()
	{
		str="Core Java";
	}
	public  static ExampleLazyInst getInstnce()
	{
		if(obj==null)
		{
			obj=new ExampleLazyInst();
			
		}
		return obj;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleLazyInst s1=new ExampleLazyInst().getInstnce();
		ExampleLazyInst s2=new ExampleLazyInst().getInstnce();
		ExampleLazyInst s3=new ExampleLazyInst().getInstnce();
		
//		s1.str=s1.str.toUpperCase();
//		
//		System.out.println(s1.str);
//		System.out.println(s2.str);
//		System.out.println(s3.str);
		
s1.str=s1.str.toLowerCase();
		
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		
	}

	
	
	

}
