
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java";
		String st[]=s.split(" ");
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				for(int k=0;k<s.length();k++)
				{
					for(int l=0;l<s.length();l++)
					{
						if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
						{
							System.out.print(s.charAt(i));
							System.out.print(s.charAt(j));
							System.out.print(s.charAt(k));
							System.out.print(s.charAt(l));
						}
					}
				}
				
			}
		}
	}

}
