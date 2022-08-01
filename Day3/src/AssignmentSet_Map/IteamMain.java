package AssignmentSet_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class IteamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Item> al=new ArrayList<>();
		al.add(new Item(112,"Parleg",5,10));
		al.add(new Item(113,"GoodDay",15,30));
		al.add(new Item(112,"Parleg",7,5));
		al.add(new Item(113,"GoodDay",15,30));
		al.add(new Item(104,"monaco",10,20));
		al.add(new Item(107,"MariGold",8,10));
		al.add(new Item(109,"Bourbon",7,20));

		HashMap<String,Integer> hm=new HashMap<>();
		
		for(Item a:al)
		{
			if(hm.containsKey(a.name))
			{
				hm.put(a.name, hm.get(a.name)+a.qty);
			}
			else
				hm.put(a.name, a.qty);
		}
		System.out.println(hm);
		
		
	}

}
