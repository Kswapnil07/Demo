package AssignmentString;

import java.util.Arrays;

public class RemoveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a programming language";
		//char ch[] = s.toCharArray();
//		for(int i=0;i<s.length();i++)
//		{
//			if(ch[i]!='a')
//							
//			System.out.print(ch[i]);
//					
//			}
		String str="";
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			if(st[i].equals("is"))
			{
				st[i]=" ";
			}
			str=str+st[i];
		}
		System.out.println(str);
	//	System.out.println(Arrays.toString(st));
		
		
		
		
	}

}
