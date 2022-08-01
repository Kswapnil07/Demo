package AssignmentString;

public class SplitString {

	public static void main(String[] args) {
		

		String s="HELLO$WORLD";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='$')
			ch[i]=' ';		
		//	System.out.println(ch[i]);
					
			}
	      s=new String(ch);
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			
		}
		
//		String s1="HELLO$WORLD";
//	
//		String str[]=s1.split("\\$");
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
	}

}
