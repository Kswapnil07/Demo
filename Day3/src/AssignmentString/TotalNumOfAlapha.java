package AssignmentString;

public class TotalNumOfAlapha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "javaIS&%12@#";
		char ch[] = s.toCharArray();
		int alpha = 0;
		int digit = 0;
		int specialchar = 0;
		
		for (int i=0; i<ch.length; i++)
		{
			if ((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='A'&&ch[i]<='Z')) 
			{

				alpha++;
			} 
			else if (ch[i]>=48&&ch[i]<=57)
			{
                digit++;

			}

			else

				specialchar++;
		}

		System.out.println("total num of alpha:"+alpha);
		System.out.println("total num of digit:"+digit);
		System.out.println("total num of specialchar:"+specialchar);

	}

}
