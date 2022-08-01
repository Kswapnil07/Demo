package string;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="swapnil";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println("vovel:"+ch[i]);
			}
			
			else 
					System.out.println("consonent:"+ch[i]);
				
			}
		
			
		}
	}


