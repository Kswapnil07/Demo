package enumm;

public class BookMyShow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(BookMyShow.SILVER);
		
		
		BookMyShow b=BookMyShow.SILVER;
		
		System.out.println(BookMyShow.SILVER);
		b.discription();
		
		BookMyShow b2=BookMyShow.GOLD;
		System.out.println(BookMyShow.GOLD);
		b2.discription();
		
		BookMyShow a=BookMyShow.PLATINUM;
		System.out.println(BookMyShow.PLATINUM);
		a.discription();
	}

}
