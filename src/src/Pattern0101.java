
public class Pattern0101 {

	public static void main(String[] args) {              //0
		// TODO Auto-generated method stub                //1 1
		                                                  //2 3 5
		int r=4;
		int a=0,b=1;

		for(int i=1;i<=r;i++)  //i=3
		{
			for(int j=1;j<=i;j++) //j=3
			{
				//System.out.print((i+j)%2);
				System.out.print(a+" ");  
				int c=a+b;     // c=13
				a=b;          //a=8
				b=c;         //b=13
				
			}
			System.out.println();
		}
				
	}

}


/*0
0 1 
0 1 1
0 1 1 2
0 1 1 2 3*/



/*0
0 1 1
0 1 1 2 3
0 1 1 2 3 5 8*/



