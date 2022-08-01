package AssignmentComparatorHashMap;
import java.util.HashMap;
import java.util.LinkedList;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al=new LinkedList<>();
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
		
		LinkedList<String>al1=new LinkedList<>();
		
		for(int i=0;i<al.size();i++)
		{
			switch(al.get(i))
			{
			case 1:
				al1.add("one");
				break;
			case 2:
				al1.add("Two");
				break;
			case 3:
				al1.add("three");
				break;
			case 4:
				al1.add("four");
				break;
			}
		}
		System.out.println(al1);
		HashMap<String ,Integer>st=new HashMap<>();
		for(String s:al1)
		{
			if(st.containsKey(s))
			{
				int v=st.get(s)+1;
				st.put(s, v);
			}
			else
				st.put(s, 1);
		}
		System.out.println(st);
		
		
		
		
		
	}

}
