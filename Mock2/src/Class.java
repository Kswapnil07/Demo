
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java World";
		//output= "ajav owlrd"
		String st []=s.split(" ");
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
//		for(int i= ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
//		
//		int count=0;
//		char ch[]=s.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
//		{
//			count++;
//		}
//		}
//		System.out.println(count);
//	}

}
}