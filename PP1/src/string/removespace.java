package string;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="SaketSaurav       is a QualityAna  list";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				System.out.print(ch[i]);
		}
		
	}

}
