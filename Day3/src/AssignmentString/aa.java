package AssignmentString;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="THE SKY IS THE LIMIT";
		
		String s[]=s1.split(" ");
		char ch[]=s1.toCharArray();
		
		int sum=0;		
  
		for(int i=0;i<s.length;i++)
		{  
			if(ch[i]>=64 && ch[i]<90)
			{
				sum=sum+(ch[i]-64);
			}
		}
		
		System.out.println("total sum of digit:"+sum);
	}

}
