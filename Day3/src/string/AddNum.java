package string;
public class AddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="a4fg6re8e7t2";
		char ch[]=s1.toCharArray();
		
		int sum=0;		
  
		for(int i=0;i<ch.length;i++)
		{  
			if(ch[i]>=48 && ch[i]<57)
			{
				sum=sum+(ch[i]-48);
			}
		}
		
		System.out.println("total sum of digit:"+sum);
} 

}
  
