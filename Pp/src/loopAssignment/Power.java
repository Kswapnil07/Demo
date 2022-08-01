package loopAssignment;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base=3,ex=3;
		
		long result =1;
		while(ex!=0) {
			
			result=result*base;
			ex--;
		}
		System.out.println(result);
		
	}
}
