
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=4;
	/*	
		for(int i=r;i>=1;i--) //i=3
		{
			for(int j=1;j<=i;j++) //j=1
			{
				System.out.print("*"); //****
			}                          //***
			System.out.println();      //**
		} */                             //*

		/*
		for(int i=1;i<=5;i++)//i=3
		{
			for(int j=1;j<=(i*2-1);j++)//j=1  j<=5
			{
				System.out.print(j); //1
			}                        //123
			System.out.println();    //12345
		}*/
		
		
		int a=0,b=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}                        
			System.out.println();
			a=0;
			b=1;
		}
	}

}

/*1
123
12345
1234567*/

/*****   
***
**
**/


/*0 
0 1 1 
0 1 1 2 3 
0 1 1 2 3 5 8*/