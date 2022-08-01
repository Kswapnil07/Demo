package pratics;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" java is a programming language";
		
		String st[]=s.split(" ");
		
		for(int i=st.length-1;i>=0;i--)
		{
		System.out.println(st[i]);
		}
	}

}
