package wrapperClass;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1=new Integer(20);
		Integer i2=new Integer("20");
		
		Character c1=new Character('s');
		
		Float f1= new Float(3.5f);
		Float f2= new Float(3.5);
		Float f3= new Float("3.5");
		
		
		Integer it1=Integer.valueOf(30);
		Integer it2=Integer.valueOf("30");
		Integer it3=Integer.valueOf("321", 4);
		System.out.println(it3);
		
		int i=Integer.parseInt("20");
		float f=Float.parseFloat("30.5");
		
		System.out.println(f);
		System.out.println();
		//value of ...wrap primitive data type to wrapper classes public static
		//3 overloaded methode for byte ,short,int, long
	}

}
