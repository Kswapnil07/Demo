package string;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='#';
					
				}
			}
			if(ch[i]!='#')
			{
			System.out.println(ch[i]+" "+cnt);	
			}
		}
		
		
		


		
	}

}
