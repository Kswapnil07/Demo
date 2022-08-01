        package practics;

        public class frequencyofdigit {

        public static void main(String[] args) {
		int num=352459889,temp;
		temp=num;
		for(int i=0;i<=9;i++)
		{
        int cnt=0;
         while(num!=0)
        {
	     int r= num%10;
	   if(r==i)
	    {
		cnt++;
       }
	   num=num/10;
        }
	    num=temp;
	    
		System.out.println(i+" " +cnt);
        }
        }
	    }
        