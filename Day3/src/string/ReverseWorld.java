package string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="javaisaprogramminglanguage ";
		String str[]=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) 
		{
			System.out.println(str[i]);
		}
		
		
		
		
//		for(int i=0;i<str.length/2;i++)
//		{
//			String temp=str[i];
//			str[i]=str[str.length-(i+1)];
//			str[str.length-(i+1)]=temp;
//		}
//		System.out.println(Arrays.toString(str));

		
		
		
		char ch[]=s.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char a =sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(a==ch[i])
			{
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
