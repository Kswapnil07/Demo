package string;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="good bye is  good bye";
		
		String st[]=s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].equals(st[j])) {
					st[j] = "#";
					cnt++;
				}

			}
			if (cnt > 1 && st[i] != "#") {
				System.out.println(st[i]);
			}
		}
	}

}
	

