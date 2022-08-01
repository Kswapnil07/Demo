package string;

public class WorldOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Good bye bye world world";
		
		s=s.toLowerCase();
		String st[]=s.split(" ");
		//char ch[] = s.toCharArray();
		for(int i=0;i<st.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<st.length;j++)
			{
				 
				if(st[i].equals(st[j]))
				{
					cnt++;
					st[j]="0";
				}
				
				}
			if(cnt>1&&st[i]!="0") {
				System.out.println(st[i]);
			}
		}
				

	}

}
