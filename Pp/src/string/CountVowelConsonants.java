package string;

public class CountVowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a programming language";
		char ch[]=s.toCharArray();
		int vcnt=0;
		int ccnt=0;
		for(int i=0;i<ch.length;i++)
		{
		
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vcnt++;
				System.out.println(ch[i]);
			}
		
		else 
		{
			if(ch[i]>='a'&&ch[i]<='z')
			ccnt++;
				
			}
		}
		System.out.println(vcnt);
		System.out.println(ccnt);
	}

}
