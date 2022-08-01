package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="APple";
		String s2="ppAle";
		
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		
	
		if (ch.length == ch1.length) 
		{
			for (int i = 0; i < ch.length; i++) 
			{
				for (int j = i + 1; j < ch.length; j++) 
				{
					if (ch[i] > ch[j])
					{
						char temp = ch[i];
						ch[i] = ch[j];
						ch[j] = temp;
					}

				}

			}
			System.out.print(ch);

			System.out.println();

			for (int i = 0; i < ch1.length; i++) 
			{
				for (int j = i + 1; j < ch1.length; j++) 
				{
					if (ch1[i] > ch1[j])
					{
						char temp = ch1[i];
						ch1[i] = ch1[j];
						ch1[j] = temp;
					}

				}
			}
			System.out.println(ch1);
			
			boolean tr = false;
			
//			if(Arrays.compare(ch, ch1)) {
//				
//			}
//			else
//			{
//				
//			}
			
			if(Arrays.equals(ch, ch1));
			
			for(int i =0;i<ch1.length;i++)
			{
				if(ch1[i]==ch[i])
				{
					tr= true;
				}
				else
				{
					tr=false;
					break;
				}
			}
			
			if(tr)
			{
				System.out.println("anagram");
			}
			else
				System.out.println("Not anagram");
		}
		else 
		{
			System.out.println("not anagram");
		}
		
		
//		if(ch.length==ch1.length)
//		{
//			Arrays.sort(ch);
//			Arrays.sort(ch1);
//			
//			if(Arrays.equals(ch, ch1)) 
//			{
//				System.out.println("Anagram");
//			}
//			else
//			{
//				System.out.println("Not Anagram");
//			}
//		}
//		else
//		{
//			System.out.println("Not Anagram");
//		}
		
		
	}
}
		
		
		
		
			

