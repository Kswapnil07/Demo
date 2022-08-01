package string;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello";
		String s1="Bye";
		String s2="Hi";
		
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int j=0;
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
			System.out.print(ch[i]);
				if(j<ch1.length) 
				{
					
					System.out.print(ch1[j]);
				j++;
				}
					if(k<ch2.length)
					{
						System.out.print(ch2[k]);
					k++;
				}
					
			}
			
			}
		}
	


