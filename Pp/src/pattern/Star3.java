package pattern;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++)
		{
			for (int j=2*(5-i); j>=0; j--)     
		{
			System.out.println(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
		}

}
}