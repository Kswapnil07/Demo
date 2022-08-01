package string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a programming language";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ') {
				System.out.print(ch[i]);
			}
		}
	}

}
