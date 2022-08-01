package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Apple";
		String s1="ppAle";
		
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		
		if(ch.length==ch1.length)
		{
			for(int i=0;i<ch.length;i++)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]>ch[j])
					{
						char t=ch[i];
						ch[i]=ch[j];
						ch[j]=t;
					}
				}
			}
			System.out.println(ch);
			
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=i+1;j<ch1.length;j++)
				{
					if(ch1[i]>ch1[j])
					{
						char d=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=d;
					}
				}
			}
			System.out.println(ch1);
			
			
			if(Arrays.equals(ch, ch1))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
			
		}
		else {
			System.out.println("not anagram");
		}
		
		
	}

}
