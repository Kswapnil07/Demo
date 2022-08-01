package string;

public class ReverseChWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a programming language";
		
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(s);
		
		System.out.println();
		
		System.out.println(rev);
				
	}

}
