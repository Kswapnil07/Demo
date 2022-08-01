package string;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='#';
				}
				
			}
			if(ch[i]!='#')
				System.out.println(ch[i]+" "+cnt);
			
		}
		
//		for(int i=0;i<ch.length;i++)
//		{
//			int cnt=1;
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j]&&j<i)
//				{
//					
//					//break;
//				}
//				else if(ch[i]==ch[j]&&j>=i) {
//					cnt++;
//				}
//			}
//			
//			if(cnt!=0)
//			{
//				System.out.println(ch[i]+" "+cnt);
//			}
//		}
		
	}

}
