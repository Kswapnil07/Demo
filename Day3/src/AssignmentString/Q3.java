package AssignmentString;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="THE SKY IS THE LIMIT";
		
		String s[]=s1.split(" ");
		int a[]=new int[s.length];
		
		for(int i=0;i<s.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<s[i].length();j++)
			{
				
				sum=sum+((s[i].charAt(j))-64);
			}
			
			a[i]=sum;
			
			System.out.println(s[i]+" "+sum);
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					String st=s[i];
					s[i]=s[j];
					s[j]=st;
					
				}
			}
			System.out.println(s[i]+" "+a[i]);
		}
		
		
				
		
		
		
//		char ch[]=s.toCharArray();
//		
//		
//		  
//		for(char c='A';c<='Z';c++)
//		{
//			int sum=0;
//			
//			for(int i=0;i<s.length();i++)
//				
//			{
//			if(c==ch[i])
//			{
//			
//				sum=sum+(c-64);
//				
//				
//			}
//			
//			}
//			System.out.println("sum of char digit:"+sum);
//			
//	      }
		
		

	}

}
