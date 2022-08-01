package wrapperClass;

public class WrapperExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		
		Integer i1=new Integer(a);
		Integer i2=a;
		
		Integer it=100;
		
		
		System.out.println(i1==i2);//memory location same string 
		
			int a1=it;//auto unboxing
		
		Float f=new Float(200.5f);//
		
		float f1=f;//respective premitive data type
		short s=f.shortValue();
		long l=f.longValue();
		int b=f.intValue();
		byte k=f.byteValue();
		double d=f.doubleValue();
		
		System.out.println(f);
		
		Short ss=new Short("20");
		
		short s1=ss.shortValue();
		float f2=ss.floatValue();
		long l1=ss.longValue();
		int b1=ss.intValue();
		byte k1=ss.byteValue();
		double d1=ss.doubleValue();
		
		 Long ll=new Long(40);
		 
		 short s2=ll.shortValue();
			float f3=ll.floatValue();
			long l2=ll.longValue();
			int b2=ll.intValue();
			byte k2=ll.byteValue();
			double d2=ll.doubleValue();
			
			Integer ii=new Integer(10);
			
			short s3=ii.shortValue();
			float f4=ii.floatValue();
			long l3=ii.longValue();
			int b3=ii.intValue();
			byte k3=ii.byteValue();
			double d3=ii.doubleValue();
			
			Byte bb=new Byte("5");
			
			short s4=bb.shortValue();
			float f5=bb.floatValue();
			long l4=bb.longValue();
			int b4=bb.intValue();
			byte k4=bb.byteValue();
			double d4=bb.doubleValue();
			
			Double dd =new Double(50.0d);
			double d5=dd.doubleValue();
			short s5=dd.shortValue();
			float f6=dd.floatValue();
			long l5=dd.longValue();
			int b5=dd.intValue();
			byte k5=dd.byteValue();
			
			
		
			
			
			
		 
		
		
	}
	
	
	

}
