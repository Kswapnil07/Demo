 package string;

public class Addnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="tgh5fg5n255";
		
		char ch[]=s.toCharArray();
		
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<57)
			{
				sum=sum+(ch[i]-48);
			}
			
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
