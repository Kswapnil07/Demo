package basic;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5,i=2;
		int mid=num/2;
		while(i<=mid)
		{
			if(num%i==0) 
			{
				
				break;
			}
			i++;
		}
		if(i>mid) {
			System.out.println("p");
		}
		else 
			System.out.println("n");
		
		
	}

}
