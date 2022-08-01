package string;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Apple";
		String s1="ppAle";
		char ch []=s.toCharArray();
		char ch1 []=s1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not Anagram");
		}
		
		
		
	}

}
