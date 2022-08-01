package Assignment2;
import java.util.Scanner;
public class nationalgame {
String country;
void country(String c) {
	country=c;
}
void game() {
	switch(country) {
	
	case "india":
	
		System.out.println("national game of india is hockey");
		break;
	
	case "china":
	
		System.out.println("national game of china is table tennis");
		break;
	
	case "bangladesh":
		System.out.println("national game of bangladesh is kabaddi");
		break;
	
	case "italy":
	System.out.println("national game of italy is football ");	
	break;
	
	}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
      Scanner sc= new Scanner(System.in);
      nationalgame c1=new nationalgame();
      System.out.println("enter countery name: ");
      country =sc.next();
      c1.country(country);
      c1.game();

      nationalgame c2=new nationalgame();
      System.out.println("enter countery name: ");
      country =sc.next();
      c2.country(country);
      c2.game();
      
      nationalgame c3=new nationalgame();
      System.out.println("enter countery name: ");
      country =sc.next();
      c3.country(country);
      c3.game();
      
      nationalgame c4=new nationalgame();
      System.out.println("enter countery name: ");
      country =sc.next();
      c4.country(country);
      c4.game();
	}

}
