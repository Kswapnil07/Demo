package featureofjava;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(200);
		al.add(500);
		al.add(700);
		al.add(300);
		al.add(80);
		al.add(350);
		al.add(1000);
		al.add(1200);
		
		Consumer<Integer>print=(t)->
		{
			if(t>800)
				System.out.println(t);
		};
		al.forEach(print);
		
	}

}
