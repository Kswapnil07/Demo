package enumm;

import java.util.Arrays;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Colors.BLACK);
		Colors c1=Colors.BLACK;
		System.out.println(c1.ordinal());
		
		Colors c2[]=Colors.values();
		for(Colors c:c2)
		{
		System.out.println(c);	
		}
		System.out.println(Arrays.toString(c2));
	}

}
