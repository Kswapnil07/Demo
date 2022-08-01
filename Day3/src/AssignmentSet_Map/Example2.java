package AssignmentSet_Map;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>al=new LinkedList<>();
		 
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		LinkedList<Integer>al1=new LinkedList<>();
		al1.add(11);
		al1.add(22);
		al1.add(33);
		al1.add(44);
		LinkedList<Integer>al2=new LinkedList<>();
		
		for (int i = 0; i < al.size(); i++) {
			al2.add(al.get(i));
			{
				if (i < al1.size()) {
					al2.add(al1.get(i));
				}

			}
		}

		System.out.println(al2);

	}

}
