package string;

public class RemoveRepeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a Programming language";
		char ch[] = s.toCharArray();
	
		int cnt=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();i++)
			{
				if(ch[i]==ch[j]) 
				{
					cnt++;
				}
				cnt=cnt+ch[i];
				System.out.println(ch[i]);
			}
			
		}
			
			
			
			
			
				
			
		
	}

}
