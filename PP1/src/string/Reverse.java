package string;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a";
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
