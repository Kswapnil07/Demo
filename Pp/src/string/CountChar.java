package string;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="i am swapnil";
		char ch[]=s.toCharArray();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
				//if(s.charAt(i)!=' ')
			if(ch[i]!=' ')
					cnt++;
					
				}
			System.out.println(cnt);
			
			}
		}
	


