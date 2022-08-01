package constructor;
import java.util.Scanner;
public class Theater {
int contact;
String name, m1,m2,m3,m4,address;
Theater(){}

public void setContact(int contact) {
	this.contact=contact;
}
public int getcontact() {
	return contact;
}
public void setName(String name) {
	this.name=name;
}
public String getname() {
	return name;
}
public void setM1(String m1) {
	this.m1=m1;
}
public String getm1() {
	return m1;
}
public void setM2(String m2) {
	this.m2=m2;
}
public String getm2() {
	return m2;
}
public void setM3(String m3) {
	this.m3=m3;
}
public String getm3() {
	return m3;
}
public void setM4(String m4) {
	this.m4=m4;
}
public String getm4() {
	return m4;
}
public void setAddress(String address) {
	this.address=address;
}
public String getaddress() {
	return address;
}
void movieDetails(String movie) {
	if(movie.equals(m1)) {
		System.out.println("ticket price: 150,200,250");
		System.out.println("show time : 9am,12pm,3pm,6pm");
	}
	else if(movie.equals(m2)) {
		System.out.println("ticket price: 150,200,250");
		System.out.println("show time : 9am,12pm,3pm,6pm");
	
	}
	else if(movie.equals(m3)) {
		System.out.println("ticket price: 150,200,250");
		System.out.println("show time : 9am,12pm,3pm,6pm");
	
	}
	else if(movie.equals(m4)) {
		System.out.println("ticket price: 150,200,250");
		System.out.println("show time : 9am,12pm,3pm,6pm");
	
	}
	else
	{
		System.out.println("no movie");
	}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Theater t1=new Theater();
t1.setContact(776894);
t1.setName("city pride");
t1.setM1("RRR");
t1.setM2("kgf");
t1.setM3("uri");
t1.setM4("radheshyam");
t1.setAddress("satara road pune");
Scanner sc=new Scanner(System.in);

System.out.println(t1.getname());
System.out.println(t1.getcontact());
System.out.println("movie: "+t1.getm1()+"/"+t1.getm2()+"/"+t1.getm3()+"/"+t1.getm4());
System.out.println("enter movie name");
String movie=sc.nextLine();
t1.movieDetails(movie);
System.out.println();


	}

}
