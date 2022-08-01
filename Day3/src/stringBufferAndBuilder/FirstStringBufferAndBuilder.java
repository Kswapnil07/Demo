package stringBufferAndBuilder;

public class FirstStringBufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf=new StringBuffer("java");
		
		sbf.append("Language");
		System.out.println(sbf);
		
		String s=new String("java");
		s.concat("language");
		System.out.println(s);
		
//		sbf.reverse();
//		System.out.println(sbf);
		
		System.out.println(sbf.capacity());//16+4
		System.out.println(sbf.length());
		
		sbf.replace(5, 8, "LAN");//start index,end index,replacement(5-8)=3 char from 5
		System.out.println(sbf);
		
		sbf.delete(5, 8);//5,6,7
		System.out.println(sbf);
		
		sbf.deleteCharAt(5);
		System.out.println(sbf);
		
		System.out.println(sbf.indexOf("av"));
		
		sbf.insert(5, "Lang");
		System.out.println(sbf);
		
		sbf.insert(5, 3.5f);
		System.out.println(sbf);
		
		
	}

}
