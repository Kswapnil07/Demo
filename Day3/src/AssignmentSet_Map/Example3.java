package AssignmentSet_Map;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm=new HashMap<>();
		
		hm.put("72499231351", "BJP");
		hm.put("45135184126", "ShivSena");
		hm.put("465354624586", "NCP");
		hm.put("57895621354", "Congress");
		hm.put("724922451351", "BJP");
		hm.put("451351824526", "Manse");
		hm.put("62159231351", "BJP");
		hm.put("448755184126", "Manse");
		
		HashMap<String,Integer> hm1=new HashMap<>();
		for(String s:hm.values())
		{
			if(hm1.containsKey(s))
			{
				hm1.put(s,hm1.get(s)+1);
	
			}
			else
				hm1.put(s,1);
		}
		System.out.println(hm1);
	}
	

}
