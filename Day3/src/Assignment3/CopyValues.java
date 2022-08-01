package Assignment3;
import java.util.Scanner;
public class CopyValues {
int id;
String name;

CopyValues(int id,String name){
	this.id=id;
	this.name=name;
	
}
void setId(int id) {
	this.id=id;
}
int getid() {
	return id;
}
	void setName(String name) {
		this.name=name;
	}
	
	String getname() {
		return name;
		
	}
	
	void display() {
		System.out.println("Details :"+id+" "+name);
	}
		
	
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter id name" );
		int id=sc.nextInt();
		String name=sc.next();
		CopyValues c1=new CopyValues(id,name) ;
		CopyValues c2=new CopyValues(c1.getid(),c1.getname()) ;

		c1.display();
		c2.display();
	}

}
