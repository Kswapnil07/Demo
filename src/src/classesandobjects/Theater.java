package classesandobjects;

import java.util.Scanner;

public class Theater {

	String name,m1,m2,m3,m4, addr,contact;
	
	/*Theater()
	{
		m1="RRR";
		m2="Pushpa";
		m3="Beast";
		m4="Pawankhind";
	}*/
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getM1() {
		return m1;
	}


	public void setM1(String m1) {
		this.m1 = m1;
	}


	public String getM2() {
		return m2;
	}


	public void setM2(String m2) {
		this.m2 = m2;
	}


	public String getM3() {
		return m3;
	}


	public void setM3(String m3) {
		this.m3 = m3;
	}


	public String getM4() {
		return m4;
	}


	public void setM4(String m4) {
		this.m4 = m4;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}
	
	void movieDetail(String movie)
	{
		if(movie.equalsIgnoreCase(m1))
		{
			System.out.println("ticket Price: 150,200,250");
			System.out.println("Shows: 9am,12pm,3p,6pm,9pm");
		}
		else  if(movie.equals(m2))
		{
			System.out.println("ticket Price: 150,200,250");
			System.out.println("Shows: 9am,12pm,3p,6pm,9pm");
		}
		else
		{
			System.out.println("no such movie");
		}
		
		
		//System.out.println("RRR/PUSHPA");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Theater t1= new Theater();
		Theater t2= new Theater();
		Theater t3= new Theater();
		t1.setM1("RRR");
		t1.setM2("Pushpa");
		t1.setM3("Pet Puran");
		t1.setM4("Pawankhind");
		t1.setName("City pride");
		t1.setAddr("Pune");
		t1.setContact("9876543210");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(t1.getName());
		System.out.println("Movies: "+t1.getM1()+"/"+t1.getM2()+"/"+t1.getM3()+"/"+t1.getM4());
		System.out.println("Enter the movie name: ");
		String movie=sc.nextLine();//RRR
		
		t1.movieDetail(movie);
		
		t2.movieDetail("Beast");

	}

}
