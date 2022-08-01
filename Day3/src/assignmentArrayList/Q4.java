package assignmentArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		
		Iterator<Integer> itr=al.descendingIterator();
		while(itr.hasNext())
		{
			
				System.out.println(itr.next());
		}
		
	}

}
