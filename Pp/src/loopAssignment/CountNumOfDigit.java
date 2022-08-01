package loopAssignment;

public class CountNumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,num=006217;
		while(i<num)
		{
			num=num/10;
			i++;
			
		}
		System.out.println(i);
	}

}
