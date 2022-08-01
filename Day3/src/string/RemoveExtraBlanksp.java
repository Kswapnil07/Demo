package string;

public class RemoveExtraBlanksp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="java is progamming language";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]);
			}
		}
				
				
	}

}
