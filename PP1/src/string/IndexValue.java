package string;

public class IndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a";
		
		char ch[]=s.toCharArray();
		
		for(char c='a';c<'z';c++) {
			
		
		for(int i=0;i<ch.length;i++)
		{
			if(c==ch[i])
			{
				System.out.println(c+" "+i);
			}
		}
	}
	}
}
