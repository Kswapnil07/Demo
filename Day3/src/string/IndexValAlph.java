 package string;

public class IndexValAlph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="The quick brown for jumps over the lazy dog";
		
		System.out.println(s1.toLowerCase());
		String s=(s1.toLowerCase());

		char ch[]=s.toCharArray();
		
			for(char c='a';c<='z';c++)
			{
				for(int i=0;i<s1.length();i++)
					
				{
				if(c==ch[i])
				
					System.out.println(c+" : "+i);
				}
					
		      }
			
//			System.out.println();
//			
//			for(int i=0;i<s1.length();i++)
//			{
//				System.out.println(ch[i]+" : "+i);
//			}

          }
	}
