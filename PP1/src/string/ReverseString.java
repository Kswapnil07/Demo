package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a";
	//	String st[]=s.split(" ");
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}
