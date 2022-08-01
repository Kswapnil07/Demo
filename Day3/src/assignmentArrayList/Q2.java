package assignmentArrayList;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		
		for(Integer i:al)
		{
			if(i==20)
			
				al.remove(2);
			
		}
		System.out.println(al);
	}

}
